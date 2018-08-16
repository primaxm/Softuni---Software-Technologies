const Sequelize = require('sequelize');

module.exports = function (sequelize) {
    let Issue = sequelize.define("Issue",{
        title: {
            type: Sequelize.TEXT,
            allowNull: false,
            required: true
        },
        content: {
            type: Sequelize.TEXT,
            allowNull: false,
            required: true
        },
        priority: {
            type: Sequelize.INTEGER,
            allowNull: false,
            required: true
        },

    },{
        timestamps:false
    });

    return Issue;
};