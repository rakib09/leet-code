package com.extremecoder.data_structure;

import java.util.Arrays;

public class Merge_Sorted_Array_88 {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int last1 = m-1;
        int last2 = n-1;
        while (last1 >= 0 && last2 >= 0) {
            if(nums2[last2] >= nums1[last1]) {
                nums1[last1 + last2 + 1] = nums2[last2--];
            } else {
                nums1[last1 + last2 + 1] = nums1[last1--];
            }
        }
        while (last2 >= 0) {
            nums1[last2]= nums2[last2--];
        }
        return nums1;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3)));
        System.out.println(Arrays.toString(merge(new int[]{0}, 0, new int[]{1}, 1)));
    }
}
