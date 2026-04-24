package com.nuist.test2;

public class Test {
    // 枚举类 Eunm
    // 希望限制用户传递参数的时候，只传递限制类型
    // 尝试用原神java模拟枚举
/*    public static void chooseSeason(String season){
        switch (season){
            case "SPRING":
                System.out.println("春天");
                break;
            case "SUMMER":
                System.out.println("夏天");
                break;
            case "AUTUMN":
                System.out.println("秋天");
                break;
            case "WINTER":
                System.out.println("冬天");
                break;
            default:
                System.out.println("输入错误");
        }
    }*/

    public static void chooseSeason(Season season) {
        switch (season.getSeasonName()) {
            case "SPRING":
                System.out.println("春天");
                break;
            case "SUMMER":
                System.out.println("夏天");
                break;
            case "AUTUMN":
                System.out.println("秋天");
                break;
            case "WINTER":
                System.out.println("冬天");
                break;
            default:
                System.out.println("输入错误");
        }
    }

    public static void chooseSeason(SeasonEnum season) {
        switch (season) {
            case SPRING:
                System.out.println(season.getSeasonInfo());
                break;
            case SUMMER:
                System.out.println(season.getSeasonName());
                break;
            case AUTUMN:
                System.out.println(season.getSeasonName());
                break;
            case WINTER:
                System.out.println(season.getSeasonName());
                break;
        }
    }

    public static void main(String[] args) {
        chooseSeason(Season.SPRING);
        chooseSeason(SeasonEnum.SPRING);
    }
}
