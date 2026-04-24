package com.nuist.exc.leetcode;

public class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        while(i<m && j<n){
            if(nums1[i]>nums2[j]){
                for(int k=m-1;k>i;k--){
                    swap(nums1,k,k-1);
                }
                nums1[i]=nums2[j];
                j++;
            }else if(nums1[i]==0){
                nums1[i]=nums2[j];
                j++;
            }
            i++;
        }
    }
    public void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
