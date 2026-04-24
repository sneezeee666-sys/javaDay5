package com.nuist.test1;

public class Test1 {
    public static void main(String[] args) {

        //如果创建StringBuilder对象，用无参方法，默认容量为16
//        StringBuilder sb = new StringBuilder();
//        sb.append("abc").append("def");
//        System.out.println(sb);
//        System.out.println(sb.capacity());
        //获取容量
//        System.out.println(sb.charAt(1));
        //获取某个索引对应的字符
//        System.out.println(sb.length());
        //获取长度
//        sb.setCharAt(1,'a');
        //修改某个索引对应的字符
//        System.out.println(sb);
//        sb.delete(1,2);
        //删除某个索引对应的字符
//        System.out.println( sb);
//        sb.deleteCharAt(0);
        //删除某个索引对应的字符
//        System.out.println( sb);
//        sb.insert(1,'a');
        //插入一个字符
//        System.out.println( sb);
//        System.out.println(sb.toString());
        //转为String
//        System.out.println(sb.indexOf("a"));
        //获取字符串中某个字符的索引
//        System.out.println(sb.lastIndexOf("a"));
        //获取字符串中某个字符的索引


/*        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb1.capacity());
        // 19      length + 16
        System.out.println(sb2.capacity());
        // 16
        sb2.append("1234567890");
        System.out.println(sb2.capacity());
        sb2.append("123456789012345678901234567890");
        System.out.println(sb2.capacity());*/
/*        System.out.println(sb2.capacity());
        sb2.append("1234567890");
        System.out.println(sb2.capacity());
        sb2.append("1234567890");
        System.out.println(sb2.capacity());*/
        //StringBuilder扩容机制
        //当增长间隔>旧容量+2，新的容量=旧容量+growth
        //当增长间隔<=旧容量+2，新的容量=旧容量*2+2

//        String a = "a";
//        String b = "b";
//        String c = "c";
//        String d = a + b + c;
//        String d = new StringBuilder().append(a).append(b).append(c).toString();
//        System.out.println(d);


        testStringBuilder(1000000);
        testStringBuffer(1000000);
        testString(1000000);

        //StringBuilder和StringBuffer的效率对比
        //远大于 String



    }
    public static void testString(int n){
        String a = "";
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            a += i;
        }
        long end = System.nanoTime();
        System.out.println("String拼接"+n+"个字符串花费的时间为："+(end - start));
    }
    public static void testStringBuilder(int n){
        StringBuilder sb = new StringBuilder();
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb.append(i);
        }
        long end = System.nanoTime();
        System.out.println("StringBuilder拼接"+n+"个字符串花费的时间为："+(end - start));
    }
    public static void testStringBuffer(int n){
        StringBuffer sb = new StringBuffer();
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb.append(i);
        }
        long end = System.nanoTime();
        System.out.println("StringBuffer拼接"+n+"个字符串花费的时间为："+(end - start));
    }



}
