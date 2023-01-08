package com.extremecoder.data_structure;

import java.util.HashSet;

public class ContainsDuplicate217 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet hashSet = new HashSet();
        for (int n: nums) {
            hashSet.add(n);
        }
        return nums.length != hashSet.size();
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
        System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}
