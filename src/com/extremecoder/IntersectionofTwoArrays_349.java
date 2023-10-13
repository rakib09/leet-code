package com.extremecoder;

import java.util.Arrays;

public class IntersectionofTwoArrays_349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        return Arrays.stream(nums1).distinct().filter(x->Arrays.stream(nums2).anyMatch(y->x==y)).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1,2,2,1}, new int[]{2,2})));
        System.out.println(Arrays.toString(intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }
}
