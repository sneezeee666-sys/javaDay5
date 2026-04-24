package com.nuist.test4;


public class Add extends Calculator{
    public Add(double a, double b) {
        super(a, b);
    }
    public Add() {}
    @Override
    public double calculate() {
        return getA() + getB();
    }
}
