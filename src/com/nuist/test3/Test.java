package com.nuist.test3;

public class Test {
    public static void main(String[] args) {
        SingleTon st = SingleTon.getInstance();
        SingleTon st1 = SingleTon.getInstance();
        System.out.println(st == st1);

    }
}
