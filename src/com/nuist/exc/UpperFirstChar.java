package com.nuist.exc;

import java.util.Scanner;

public class UpperFirstChar {
    public static StringBuilder upperFirstChar(String s){
        String[] ss = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s1 : ss){
            sb.append(Character.toUpperCase(s1.charAt(0)));
            sb.append(s1.substring(1));
            sb.append(" ");
        }
        return sb;
    }
    public static void test(){
        System.out.println("请输入一个字符串:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(upperFirstChar(s));
    }

    public static void main(String[] args) {
        test();
    }
}
