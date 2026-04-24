package com.nuist.test4;

public class Minus extends Calculator{
    public Minus(double a, double b) {
        super(a, b);
    }
    public Minus() {
    }

    @Override
    public double calculate() {
        return getA()-getB();
    }
}
