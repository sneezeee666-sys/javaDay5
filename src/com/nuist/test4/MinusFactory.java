package com.nuist.test4;

public class MinusFactory extends CalculatorFactory {
    @Override
    public Calculator getCalculator() {
        return new Minus();
    }
}
