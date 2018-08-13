using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using Blog.Data;
using Blog.Models;
using Microsoft.AspNetCore.Authorization;

namespace Blog.Controllers
{
    public class ArticleController : Controller
    {
        private readonly ApplicationDbContext _context;

        public ArticleController(ApplicationDbContext context)
        {
            _context = context;
        }

        //
        //Get: Article
        public ActionResult Index()
        {
            return RedirectToAction("List");
        }

        //
        //Get: Aticle/List
        public ActionResult List()
        {
            var articles = _context.Articles
                .Include(a => a.Author)
                .ToList();
            return View(articles);
        }

        // GET: Article/Details/5
        public async Task<IActionResult> Details(int? id)
        {
            if (id == null)
            {
                return View();
            }

            var article = await _context.Articles
                .Include(a => a.Author)
                .SingleOrDefaultAsync(m => m.Id == id);
            if (article == null)
            {
                return NotFound();
            }

            return View(article);
        }

        // GET: Article/Create
        [Authorize]
        public IActionResult Create()
        {
            //ViewData["AuthorId"] = new SelectList(_context.Users, "Id", "Id");
            return View();
        }


        [HttpPost]
        [Authorize]
        public ActionResult Create (Article article)
        {
            if (ModelState.IsValid)
            {
                //get user Id
                var authorId = _context.Users
                    .Where(u => u.UserName == this.User.Identity.Name)
                    .First()
                    .Id;

                //set articles author
                article.AuthorId = authorId;

                //save article to database
                _context.Articles.Add(article);
                _context.SaveChanges();
            }

            //return View(article);
            return RedirectToAction("Index");
        }

        //Get: Article/delete
        public ActionResult Delete(int? id)
        {
                 if (id == null)
                 {
                     return NotFound();
                 }

            var article = _context.Articles
           .Include(a => a.Author)
           .First(m => m.Id == id);

            if (IsUserAuthorizedToEdit(article) == false)
            {
                return Forbid();
            }

            if (article == null)
            {
                return NotFound();
            }

            return View(article);
        }

        //POST: Articles/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(int id)
        {
            //Get article
            var article = _context.Articles.Include(a=>a.Author).First(m=>m.Id == id);

            //check if article exist
            if (article == null)
            {
                return NotFound();
            }

            if (IsUserAuthorizedToEdit(article) == false)
            {
                return Forbid();
            }

            //Delete Artcile
            _context.Articles.Remove(article);
            _context.SaveChanges();

            //Redirect to index

            return RedirectToAction("Index");
        }

        public IActionResult Edit(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }
            //get article from DB
            var article = _context.Articles
                .Include(a => a.Author)
                .Where(a => a.Id == id)
                .First();

            //check if article exist
            if (article == null)
            {
                return NotFound();
            }

            if (IsUserAuthorizedToEdit(article) == false)
            {
                return Forbid();
            }

            //create the view model
            var model = new ArticleViewModel();
            model.Id = article.Id;
            model.Title = article.Title;
            model.Content = article.Content;

            //pass the model to view
            return View(model);
        }



        // POST: Articles/Edit/5
        [HttpPost]
        public ActionResult Edit(ArticleViewModel model)
        {
            if (ModelState.IsValid)
            {
                //get the article
                var article = _context.Articles
                    .FirstOrDefault(a => a.Id == model.Id);

               // if (IsUserAuthorizedToEdit(article) == false)
               // {
               //     return Forbid();
               // }

                //Set new properties
                article.Title = model.Title;
                article.Content = model.Content;

                //save changes
                _context.Update(article);
                _context.SaveChanges();

                //redirect to index
                return RedirectToAction("Index");
            }

            //if model is invalid return the same view
            return View(model);
        }

        private bool IsUserAuthorizedToEdit(Article article)
        {
            bool isAdmin = this.User.IsInRole("Admin");
            bool isAuthor = article.IsAuthor(this.User.Identity.Name);
            return isAdmin || isAuthor;
        }
        


        private bool ArticleExists(int id)
           {
              return _context.Articles.Any(e => e.Id == id);
           }
    }
}
