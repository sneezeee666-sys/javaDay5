package com.nuist.exc;

class HasStatic {
    private static int x = 100;
    public static void main(String args[ ]) {
        String s = "hello";
        s = s + "world";
        System.out.println(s);
    }
}
