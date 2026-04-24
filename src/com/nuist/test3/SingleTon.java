package com.nuist.test3;

//单例模式
//单例模式的核心是创建唯一对象
//单例模式三要素
//1. 构造方法私有化
//2. 私有的 当前静态类引用
//3. 创建公有的静态方法 用于给外部使用者返回当前类对象

//懒汉模式：只有在类加载的时候创建对象（又叫延迟加载）  （现炒菜老板）
//懒汉模式的缺点
//1. 线程不安全
//2. 创建对象时耗时，用户需要等待创建对象后才能使用
public class SingleTon {
    private SingleTon() {
    }
    private static SingleTon instance;
    public static SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
            //只有在类加载的时候创建对象（又叫延迟加载
        }
        return instance;
    }
}
