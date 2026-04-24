package com.nuist.exc.leetcode;

public class Test {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        Solution2 s = new Solution2();
        s.merge(nums1,nums1.length, nums2, nums2.length);
        for (int i = 0; i < nums1.length; i++){
            System.out.print(nums1[i]+" ");
        }


    }
}
