package com.nuist.test1;

import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
           testConfirmCode();
    }

    public static void testConfirmCode() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String code = RandomStringUtil.getRandomString(4, 4);
            System.out.println("验证码为:" + code);
            System.out.println("请输入验证码:");
            String userInputCode = sc.nextLine();
            if (code.equalsIgnoreCase(userInputCode)) {
                System.out.println("验证通过!");
                break;
            } else {
                System.out.println("验证码错误!重新输入");
            }
        }
    }

}
