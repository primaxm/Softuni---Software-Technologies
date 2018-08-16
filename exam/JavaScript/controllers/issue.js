const Issue = require('../models').Issue;

module.exports = {
    index: (req, res) => {
        Issue.findAll({
            limit: 666,
            
        }).then(issues => {
            res.render('issue/index', {
                issues: issues
            });
        })
    },
	
    createGet: (req, res) => {
        res.render('issue/create');
    },
	
    createPost: (req, res) => {
        let issueArgs = req.body.issue;
    
        let errorMsg = '';

        if (!issueArgs.title) {
            errorMsg = 'Invalid title!';
        } else if (!issueArgs.content) {
            errorMsg = 'Invalid content!';
        } else if (!issueArgs.priority) {
            errorMsg = 'Invalid priority!';
        };
        
        if (errorMsg) {
            res.render('issue/create', {error: errorMsg});
            return;
        };
        
      
        Issue.create(issueArgs).then(cat => {
            res.redirect('/');
        }).catch(err => {
            console.log(err.message);
            res.render('issue/create', {error: err.message});
        });
    },
	
    editGet: (req, res) => {
        let id = req.params.id;
        Issue.findById(id).then(issue => {
            res.render('issue/edit', {issue: issue})
        })
    },

    editPost: (req, res) => {
        let issueArgs = req.body.issue;
        let issueId = req.params.id;
    
        let errorMsg = '';

        if (!issueArgs.title) {
            errorMsg = 'Invalid title!';
        } else if (!issueArgs.content) {
            errorMsg = 'Invalid content!';
        } else if (!issueArgs.priority) {
            errorMsg = 'Invalid priority!';
        };
        
        if (errorMsg) {
            res.render('issue/edit', {error: errorMsg});
            return;
        };
        
        
        Issue.findById(issueId).then(issue => {
            issue.update(issueArgs).then(() => {res.redirect('/');})
        }).catch(err => {
            console.log(err.message);
            res.render('issue/edit/:id', {issue: issueArgs, error: err.message});
        });
    },

    deleteGet: (req, res) => {
        let id = req.params.id;
        Issue.findById(id).then(issue => {
            res.render('issue/delete', {issue: issue})
        })
    },
	
    deletePost: (req, res) => {
        let id = req.params.id;
        Issue.findById(id).then(issue => {
            issue.destroy().then(() => {res.redirect('/');})
        })
    }
};