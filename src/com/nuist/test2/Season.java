package com.nuist.test2;

public class Season {
    private Season() {
    }
    private String seasonName;
    private String seasonInfo;
    private Season(String seasonName, String seasonInfo){
        this.seasonName = seasonName;
        this.seasonInfo = seasonInfo;
    }

    public static final Season SPRING = new Season("SPRING", "春暖花开");
    public static final Season SUMMER = new Season("SUMMER", "夏日炎炎");
    public static final Season AUTUMN = new Season("AUTUMN", "秋高气爽");
    public static final Season WINTER = new Season("WINTER", "冰天雪地");

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonInfo() {
        return seasonInfo;
    }
}
