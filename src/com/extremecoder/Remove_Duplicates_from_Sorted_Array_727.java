package com.extremecoder;

public class Remove_Duplicates_from_Sorted_Array_727 {
    public int removeDuplicates(int[] nums) {
        int duplicate_count = 0;
        if(nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                if(nums[i-1] == nums[i]) {
                    duplicate_count ++;
                } else {
                    nums[i-duplicate_count] = nums[i];
                }
            }
        }
        return (nums.length - duplicate_count);
    }

    public static void main(String[] args) {
        System.out.println(new Remove_Duplicates_from_Sorted_Array_727().removeDuplicates(new int[] {
                0,0,1,1,1,2,2,3,3,4,5,6,7,7,8,9
        }));
    }
}
