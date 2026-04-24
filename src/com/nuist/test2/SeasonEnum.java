package com.nuist.test2;
/**
 * 季节枚举类
 *
 * 定义一年四季的枚举常量，用于表示春、夏、秋、冬四个季节。
 */
public enum SeasonEnum {
    //相当于是创建了4个SeasonEnum对象 SPRING,SUMMER都是设置的
    //当前类的静态常量引用 初始化属性的时候 使用构造函数
    SPRING("SPRING", "春"),
    SUMMER("SUMMER", "夏"),
    AUTUMN("AUTUMN", "秋"),
    WINTER("WINTER", "冬");

    //定义常量，常量属性
    private String seasonName;
    private String seasonInfo;

    //提供构造方法，枚举类构造方法自带私有修饰
    private SeasonEnum(String seasonName, String seasonInfo) {
        this.seasonName = seasonName;
        this.seasonInfo = seasonInfo;
    }
    //private可以省略

    //提供getter方法
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonInfo() {
        return seasonInfo;
    }
}

