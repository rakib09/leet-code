package com.extremecoder.data_structure;

public class MaximumSubarray_53 {
    //Kadane’s algorithm
    public static int maxSubArray(int[] nums) {
        int max_so_far = Integer.MIN_VALUE;
        int max_end_here =0;
        for (int n:nums) {
            max_end_here = max_end_here + n;
            if(max_so_far < max_end_here) {
                max_so_far = max_end_here;
            }
            if(max_end_here < 0) {
                max_end_here = 0;
            }
        }
        return max_so_far;
    }
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
    }
}
