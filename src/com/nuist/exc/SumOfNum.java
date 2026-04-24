package com.nuist.exc;

import java.util.Scanner;

public class SumOfNum {
    public static int getSum(){
        System.out.println("请输入一个字符串:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(c +"");
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(getSum());
    }
}
