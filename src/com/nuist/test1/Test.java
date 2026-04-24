package com.nuist.test1;

import java.nio.charset.StandardCharsets;

public class Test {
    //    String不可变字符串
//    在jdk9之前，String底层使用char数组存储字符串
//    "abc"在底层被创建为char[] {'a', 'b', 'c'}
//    jdk9之后，String底层使用byte数组存储字符串
//    "abc"在底层被创建为byte[] {97, 98, 99}
    public static void main(String[] args) {
//        String s1 = "你干嘛";
//        byte[] bs = s1.getBytes();
//        byte[] bs1 = s1.getBytes(StandardCharsets.UTF_8);
//        for (byte b : bs) {
//            System.out.print(b + "\t");
//        }
//        System.out.println();
//        for (byte b : bs1) {
//            System.out.print(b + "\t");
//        }
//        System.out.println();
//        String newStr = new String(bs);
//        System.out.println(newStr);



////    String一般只建议通过 = 赋值创建
//        String a = "abc";
//        String b = "abc";
//        String c = new String("abc");
//        String d = "a"+"b"+"c";
//        System.out.println(a == b);
////     String 支持常量池存储 所有String对象都存储在常量池中
//        System.out.println(a == c);
////       newString   就不一样了
//        System.out.println(a == d);
////        输出true（反编译的结果）




        //String 不可变，一定是线程安全的

//        char[] cs = new char[]{'a', 'b', 'c'};
//        String s1 = new String(cs);
//        String s2 = new String(cs,1,2);
//        System.out.println(s1);
//        System.out.println(s2);
        //实际开发并不常见

        //        ---------------------方法-------------------------
       /* //charAt方法 isEmpty方法 Length方法 codePointAt方法
        String s1 = "abcdefg";
        char c = s1.charAt(2);
        System.out.println(c);
        System.out.println(s1.isEmpty());
        System.out.println(s1.length());
        System.out.println(s1.codePointAt(1)); //获取字符的编码
        String s2 = "abcdefg";
        System.out.println(s1.equals(s2));
        //String不要用 == 比较 。 String比较内容是否相同，不关注 地址
        //笔试题除外
        String s3 = "ABcdefg";
        System.out.println(s1.equalsIgnoreCase(s3));
        //忽略大小写比较

        System.out.println("abbbb".compareTo("baaaa")); //一般情况下，返回结果是字符集编码的差
        System.out.println("abbbb".compareTo("ab")); //如果前面都一样，只有长度不一样，返回len的区别
        //用于比较器

        System.out.println(s1.startsWith("ab"));
        //判断是否以ab开头
        System.out.println(s1.endsWith("g"));
        //判断是否以g结尾*/
//        System.out.println(s1.contains("ab"));
        //判断是否包含某个字符

        //String c = "abcd abcd";
//        System.out.println(c.indexOf("abc"));
//        System.out.println(c.lastIndexOf("abc"));
        //获取字符串中某个字符的索引

        //System.out.println(c.substring(2));
        //System.out.println(c.substring(2,4)); //左闭右开
        //截取字符串
        //java中的范围基本都是左闭右开

        //System.out.println(c.concat("efg"));
        //不改变原字符串，拼接字符串

        //System.out.println(c.replace("ab","12"));
        //System.out.println(c);
        //System.out.println(c.replaceFirst("ab","12"));
        //不改变原字符串，替换字符串

        //System.out.println(c.split(" "));
        //for (String s : c.split(" ")){
        //    System.out.println(s);
        //}
        //不改变原字符串，将字符串进行切分 切分成数组

        /*String c = "    Abc aBC ";
        System.out.println(c.toLowerCase());
        System.out.println(c.toUpperCase());
        System.out.println(c.trim());
        //不改变原字符串，转换大小写，去除空格

        String b = """
                
                
                
                """;
        System.out.println(b.isBlank());
        System.out.println(b.isEmpty());
        //判断字符串是否为空

        char[] cs = c.toCharArray();
        for (char c1 : cs) {
            System.out.println(c1);
        }*/

//        System.out.println("muda ".repeat(100));


//        ---------------------方法-------------------------

        //修改String的时候用
        //StringBuilder 和 StringBuffer











    }


}
