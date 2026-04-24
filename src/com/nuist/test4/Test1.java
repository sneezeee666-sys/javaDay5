package com.nuist.test4;

public class Test1 {
    public static void main(String[] args) {

        System.out.println("--- 反射工厂测试开始 ---");

        // 1. 测试加法 (传入 Add 类的完整包名+类名)
        // 注意：使用反射的好处是，这里的字符串可以写在配置文件（如 XML 或 properties）中。
        // 这样如果以后要改逻辑，连代码都不用重新编译，修改配置文件即可（这就是 Spring IOC 的核心思想）。
        String addClassName = "com.nuist.test4.Add";
        Calculator addCalculator = ReflectiveCalculatorFactory.getCalculator(addClassName);

        // 养成好习惯：防止对象创建失败引发空指针异常（NullPointerException），做个非空判断
        if (addCalculator != null) {
            addCalculator.setA(10.00);
            addCalculator.setB(20.00);
            System.out.println("加法计算结果: " + addCalculator.calculate());
        }

        System.out.println("----------------------");

        // 2. 测试减法 (传入 Minus 类的完整包名+类名)
        String minusClassName = "com.nuist.test4.Minus";
        Calculator minusCalculator = ReflectiveCalculatorFactory.getCalculator(minusClassName);

        if (minusCalculator != null) {
            minusCalculator.setA(30.00);
            minusCalculator.setB(15.00);
            System.out.println("减法计算结果: " + minusCalculator.calculate());
        }

        // 【知识拓展】
        // 如你之前在注释中所述，这就是 Spring 框架底层 IOC（控制反转）的雏形！
        // 在 Spring 中，你只需要在配置文件（如 applicationContext.xml）里写上 <bean class="com.nuist.test4.Add">
        // Spring 底层就会像我们的 ReflectiveCalculatorFactory 一样，利用反射帮你把对象创建好并放到容器中供你使用。
    }
}