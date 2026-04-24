package com.nuist.test3;

//饿汉单例模式（预制菜老板）
//在类加载的时候，对象就创建好了（预加载）
//优点
//1.线程安全
//2.开发者获取对象的时候对象已经创建好了
//缺点
//1.如果饿汉使用的比较多，会导致项目在启动的时候 会一次性创建大量对象
//导致性能开销过大 造成资源浪费

//在学习多线程之后会讲解第三种单例模式 双重检查模式
//兼具二者优点
//需要两个关键字 volatile（建议预习：缓存一致性模型：mesi 内存屏障 总线嗅探（总线风暴）  happens-before原则），
// synchronized

public class HungryMan {
    private HungryMan() {
    }
    private static HungryMan instance = new HungryMan();
    public static HungryMan getInstance() {
        return instance;
    }
}
