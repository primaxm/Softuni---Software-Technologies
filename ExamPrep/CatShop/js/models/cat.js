const Sequelize = require('sequelize');

module.exports = function (sequelize) {
    let Cat = sequelize.define("Cat",{
        name: {
            type: Sequelize.TEXT,
            allowNull: false,
            required: true
        },
        nickname: {
            type: Sequelize.TEXT,
            allowNull: false,
            required: true
        },
        price: {
            type: Sequelize.DOUBLE,
            allowNull: false,
            required: true
        },

    },{
        timestamps:false
    });

    return Cat;
};