package com.nuist.test1;

import java.util.Random;
import java.util.Scanner;

public class Exc {
    private static final String CHAR_POOL = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final Random R = new Random();

    /**
     * @param length
     * length of random string
     *
     * @return
     */
    public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = R.nextInt(CHAR_POOL.length());
            char randomChar = CHAR_POOL.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Random r = new Random();
        int len = r.nextInt(4,9);
        String randomString = getRandomString(len);
        System.out.println(randomString);
        int n = 0;
        while (true){
            System.out.println(randomString);
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入:");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase(randomString)) {
                System.out.println("输入正确");
                break;
            } else {
                System.out.println("输入错误");
            }
            System.out.println("你已经输错"+n+"次了");
            System.out.println("看清楚点，验证码是：");
            n++;
        }

    }
}
