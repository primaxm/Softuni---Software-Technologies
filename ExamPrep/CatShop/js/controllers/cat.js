const Cat = require('../models').Cat;

module.exports = {
    index: (req, res) => {
        let cats = [];
        Cat.findAll({
            limit: 666,
            
        }).then(cats => {
            res.render('cat/index', {
                cats: cats
            });
        })

        //res.render('cat/index', {'cats': cats});
    },

    createGet: (req, res) => {

        res.render('cat/create');
    },

    createPost: (req, res) => {
        let catArgs = req.body.cat;
    
        let errorMsg = '';

        if (!catArgs.name) {
            errorMsg = 'Invalid name!';
        } else if (!catArgs.nickname) {
            errorMsg = 'Invalid nickname!';
        } else if (!catArgs.price) {
            errorMsg = 'Invalid price!';
        };
        
        if (errorMsg) {
            res.render('cat/create', {error: errorMsg});
            return;
        };
        
      
        Cat.create(catArgs).then(cat => {
            res.redirect('/');
        }).catch(err => {
            console.log(err.message);
            res.render('cat/create', {error: err.message});
        });
    
    },

    editGet: (req, res) => {
        let id = req.params.id;
        Cat.findById(id).then(cat => {
            res.render('cat/edit', {cat: cat})
        })
    },

    editPost: (req, res) => {
        let catArgs = req.body.cat;
        let catId = req.params.id;
    
        let errorMsg = '';

        if (!catArgs.name) {
            errorMsg = 'Invalid name!';
        } else if (!catArgs.nickname) {
            errorMsg = 'Invalid nickname!';
        } else if (!catArgs.price) {
            errorMsg = 'Invalid price!';
        };
        
        if (errorMsg) {
            res.render('cat/edit/:id', {error: errorMsg});
            return;
        };
        
        
        Cat.findById(catId).then(cat => {
            cat.update(catArgs).then(() => {res.redirect('/');})
        }).catch(err => {
            console.log(err.message);
            res.render('cat/edit/:id', {cat: catArgs, error: err.message});
        });
    },

    deleteGet: (req, res) => {
        let id = req.params.id;
        Cat.findById(id).then(cat => {
            res.render('cat/delete', {cat: cat})
        })
    },

    deletePost: (req, res) => {
        let id = req.params.id;
        Cat.findById(id).then(cat => {
            cat.destroy().then(() => {res.redirect('/');})
        })
    }
};
