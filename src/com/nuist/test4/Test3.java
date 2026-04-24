package com.nuist.test4;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("--- 基于配置文件的反射工厂测试 ---");

        // 震惊！客户端代码中完全没有 "Add" 或 "Minus" 的字眼！
        // 开发者完全不需要知道底层到底用的是加法还是减法。
        // 对象创建的控制权，彻底交给了外部配置文件和工厂 —— 这就是极致的 IOC (控制反转)！
        Calculator calculator = ConfigurableFactory.getCalculator();

        if (calculator != null) {
            // 我们只需要针对抽象父类 Calculator 进行编程即可
            calculator.setA(100.00);
            calculator.setB(50.00);
            System.out.println("运算结果: " + calculator.calculate());
        }
    }
}