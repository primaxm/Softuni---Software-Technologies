const Sequelize = require('sequelize');
const Article = require('../models').Article;
const User = require('../models').User;

module.exports = {
    index: (req, res) => {
        Article.findAll({
            limit: 6,
            include: [{
                model: User
            }],
            order: [
                ['data', 'DESC']
            ]
        }).then(articles => {
            res.render('home/index', {
                articles: articles
            });
        })
        //res.render('home/index');
    }
};