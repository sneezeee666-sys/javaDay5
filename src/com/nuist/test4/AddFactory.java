package com.nuist.test4;


public class AddFactory extends CalculatorFactory {
    @Override
    public Calculator getCalculator() {
        return new Add();
    }
}