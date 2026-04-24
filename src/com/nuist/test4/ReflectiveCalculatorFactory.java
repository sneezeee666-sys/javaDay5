package com.nuist.test4;

/**
 * 优化后的计算器工厂类（使用反射机制）
 * 这是一个“简单工厂”的升级版，利用反射实现了动态解耦。
 */
public class ReflectiveCalculatorFactory {

    /**
     * 通过类的全限定名动态创建 Calculator 对象
     * * @param className 传入需要实例化的类的全类名（例如："com.nuist.test4.Add"）
     * @return 返回父类 Calculator 类型的对象，如果创建失败则返回 null
     */
    public static Calculator getCalculator(String className) {
        try {
            // 1. Class.forName()：根据传入的字符串（类名），将对应的字节码文件加载到内存中，并获取 Class 对象
            Class<?> clazz = Class.forName(className);

            // 2. getDeclaredConstructor()：获取该类的无参构造方法
            // 3. newInstance()：通过无参构造方法实例化出一个对象（相当于 new Add() 或 new Minus()）
            Object obj = clazz.getDeclaredConstructor().newInstance();

            // 4. 向下转型：因为我们确定创建的都是 Calculator 的子类，所以将其强转为 Calculator 类型并返回
            if (obj instanceof Calculator) {
                return (Calculator) obj;
            }

        } catch (ClassNotFoundException e) {
            System.out.println("找不到对应的类，请检查类名是否正确: " + className);
        } catch (Exception e) {
            // 捕获反射过程中可能出现的其他异常（如方法不可访问、实例化失败等）
            System.out.println("对象创建失败！");
            e.printStackTrace();
        }

        return null; // 如果发生异常，返回 null
    }
}