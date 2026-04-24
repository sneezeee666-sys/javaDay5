package com.nuist.test4;

public abstract class Calculator {
    private double a;
    private double b;
    public abstract double calculate();
    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public Calculator() {}

    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
}
