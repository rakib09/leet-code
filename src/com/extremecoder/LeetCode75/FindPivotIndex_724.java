package com.extremecoder.LeetCode75;

public class FindPivotIndex_724 {
    public static int pivotIndex(int[] nums) {
        long leftSum = 0;
        long rightSum = 0;
        for (int n: nums) {
            rightSum += n;
        }
        rightSum = rightSum - nums[0];
        if(leftSum == rightSum) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            leftSum += nums[i-1];
            rightSum -= nums[i];
            if(leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println("Output: " + pivotIndex(new int[] {1,7,3,6,5,6}));
        System.out.println("Output: " + pivotIndex(new int[] {2,1,-1}));
        System.out.println("Output: " + pivotIndex(new int[] {1,2,3}));
    }
}
