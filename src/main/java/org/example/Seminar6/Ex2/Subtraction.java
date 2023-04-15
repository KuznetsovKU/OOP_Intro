package org.example.Seminar6.Ex2;

public class Subtraction implements CalculatorOperation{
    private double left;
    private double right;
    private double resut = 0.0;

    public Subtraction(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public double getRight() {
        return right;
    }

    public void setRight(double right) {
        this.right = right;
    }

    public double getResut() {
        return resut;
    }

    public void setResut(double resut) {
        this.resut = resut;
    }


}
