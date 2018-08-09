package com.softuni.entity;

public class Calculator {
    private Double leftOperand;
    private Double rightOperand;
    private String operator;

    public Calculator() {
    }

    public Calculator(Double leftOperand, Double rightOperand, String operator) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }

    public Double getLeftOperand() {
        return leftOperand;
    }

    public Double getRightOperand() {
        return rightOperand;
    }

    public String getOperator() {
        return operator;
    }

    public void setLeftOperand(Double leftOperand) {
        this.leftOperand = leftOperand;
    }

    public void setRightOperand(Double rightOperand) {
        this.rightOperand = rightOperand;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Double calculateResult() {
        double result;
        switch (this.operator) {
            case "+":
                result = this.leftOperand + this.rightOperand;
                break;
            case "-":
                result = this.leftOperand - this.rightOperand;
                break;
            case "*":
                result = this.leftOperand * this.rightOperand;
                break;
            case "/":
                result = this.leftOperand / this.rightOperand;
                break;
            case "%":
                result = this.leftOperand % this.rightOperand;
                break;
            case "^":
                result = Math.pow(this.leftOperand, this.rightOperand);
                break;
                default:
                    result = 0;
                    break;
        }
        return result;
    }
}
