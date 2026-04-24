package com.nuist.exc.leetcode;

class Solution1 {
    public int climbStairs(int n) {
        int sum = 0;
        for(int i=0;i<=n/2;i++){
            sum+=C(n-i*2,i);
        }
        return sum;
    }

    public long C(int a, int b) {
        if (b < 0 || b > a) return 0;
        b = Math.min(b, a - b);

        long result = 1;
        for (int i = 0; i < b; i++) {
            result = result * (a - i) / (i + 1);
        }
        return result;
    }

}
