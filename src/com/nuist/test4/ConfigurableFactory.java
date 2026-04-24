package com.nuist.test4;

import java.io.InputStream;
import java.util.Properties;

/**
 * 读取配置文件的反射工厂
 */
public class ConfigurableFactory {

    /**
     * 无参获取计算器对象的方法
     * 所有的决策完全依赖于外部的 config.properties 文件
     */
    public static Calculator getCalculator() {
        try {
            // 1. 创建 Properties 对象，专门用来解析 .properties 配置文件
            Properties props = new Properties();

            // 2. 使用类加载器（ClassLoader）动态获取配置文件的输入流
            // 注意：这里假设 config.properties 放在了 src 根目录下
            InputStream is = ConfigurableFactory.class.getClassLoader().getResourceAsStream("config.properties");

            if (is == null) {
                System.out.println("未找到配置文件，请检查 config.properties 是否在 src 目录下！");
                return null;
            }

            // 3. 将输入流加载进 Properties 对象中
            props.load(is);

            // 4. 根据键名（key）获取对应的值（value），也就是类的全限定名
            String className = props.getProperty("calculator.className");

            // 5. 以下就是咱们之前写过的反射核心代码
            Class<?> clazz = Class.forName(className);
            Object obj = clazz.getDeclaredConstructor().newInstance();

            if (obj instanceof Calculator) {
                return (Calculator) obj; // 向下转型并返回
            }

        } catch (Exception e) {
            System.out.println("读取配置或反射创建对象失败！");
            e.printStackTrace();
        }

        return null;
    }
}