package com.extremecoder;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionofTwoArrays_349_1 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for (int n : nums2) {
            set.add(n);
        }
        for(int n: nums1) {
            if(set.contains(n)) {
                result.add(n);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1,2,2,1}, new int[]{2,2})));
        System.out.println(Arrays.toString(intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }
}
