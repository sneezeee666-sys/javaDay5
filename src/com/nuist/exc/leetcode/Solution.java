package com.nuist.exc.leetcode;

class Solution {
    public String addBinary(String a, String b) {
        boolean flag = false;
        String s = "";
        int aLength = a.length();
        int bLength = b.length();
        if (aLength > bLength) {
            for (int i = 0; i < aLength - bLength; i++) {
                b = "0" + b;
            }
        } else if (aLength < bLength){
            for (int i = 0; i < bLength - aLength; i++) {
                a = "0" + a;
            }
        }
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            int sum = (a.charAt(a.length() - 1 - i) - '0') + (b.charAt(b.length() - 1 - i) - '0');
            if (flag) {
                sum++;
            }
            if (sum == 0) {
                flag = false;
                s = "0" + s;
            } else if (sum == 1) {
                flag = false;
                s = "1" + s;
            } else if(sum == 2){
                flag = true;
                if (i == Math.min(a.length(), b.length()) - 1) {
                    s = "10" + s;
                } else {
                    s = "0" + s;
                }
            } else if (sum == 3) {
                flag = true;
                if (i == Math.min(a.length(), b.length()) - 1) {
                    s = "11" + s;
                } else {
                    s = "1" + s;
                }
            }
        }
        return s;
    }
}