package com.nuist.test1;

import java.util.Random;

public class RandomStringUtil {
    private RandomStringUtil() {
        throw new AssertionError("No com.nuist.test1.RandomStringUtil instances for you!");
    }
    //构造方法私有，防止私自创建对象

    // 该变量用来存放验证码所需的字母和数字的总和
    private static StringBuilder charPool;
    // 保证全局使用唯一的随机数对象 避免反复创建
    private static final Random R = new Random();

    // 在类加载的时候 就自动执行 并且只执行一次
    // 对charPool进行初始化
    static {
        StringBuilder sb = new StringBuilder();
        for (byte i = 0; i < 127; i++) {
            // 判断是否是字母或者数字所对应的字符集编码
            if (Character.isLetterOrDigit(i)) {
                // 如果是 将字符集编码转换为字符之后 存入到sb中
                sb.append((char) i);
            }
        }
        // 将sb的引用传递给charPool
        charPool = sb;
    }

    /**
     * 获取随机字符串
     *
     * @param range    控制验证码的字符数量
     * @param distance 字符数量的偏移距离  假设range = 4 distance = 4
     *                 随机生成4-8位
     * @return 随机生成的字符串
     */
    public static String getRandomString(int range, int distance) {
        // 定义验证码位数
        int n = R.nextInt(range + 1) + distance;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            // charPool.length() charPool的长度
            // R.nextInt(charPool.length()) 获取一个0-61的随机index
            // charPool.charAt(R.nextInt(charPool.length()))
            // 从charPool中获取一个随机字符
            sb.append(charPool.charAt(R.nextInt(charPool.length())));
        }
        return sb.toString();
    }

    public static String getRandomString() {
        return getRandomString(0, 4);
    }
}
