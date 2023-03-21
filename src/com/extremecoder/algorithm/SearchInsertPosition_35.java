package com.extremecoder.algorithm;

public class SearchInsertPosition_35 {
    public static int searchInsert(int[] nums, int target) {
        int low =0; int high = nums.length-1;
        while (low <= high) {
            int middle = low + ((high-low)/2);
            if(nums[middle] == target) return middle;
            else if(nums[middle] < target) {
                low = middle+1;
            } else {
                high = middle-1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 5));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 7));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 2));
    }
}
