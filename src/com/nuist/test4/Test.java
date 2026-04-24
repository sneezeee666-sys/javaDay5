package com.nuist.test4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //设计一个简易计算器
/*        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("请输入第二个数字：");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("请输入运算符：");
        String c = sc.nextLine();

        System.out.println(calculate(a, b, c));*/

        //从CalculatorFactory工厂类中获取Calculator对象
        AddFactory AddFactory = new AddFactory();
        Calculator calculator = AddFactory.getCalculator();
        calculator.setA(10.00);
        calculator.setB(20.00);
        System.out.println(calculator.calculate());
        //这就是简单的工厂模式
        //也是Spring框架底层所使用的众多设计模式之一
        //所有的对象由对应的对象工厂统一创建，开发者只需从工厂获取对象即可
        //相当于将开发者对象的权利交给了对象工厂来做 叫做IOC特性


    }

    public static double calculate(double a, double b, String c) {
        double result = 0;
        switch (c) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("输入错误");
        }
        return result;
    }
}
