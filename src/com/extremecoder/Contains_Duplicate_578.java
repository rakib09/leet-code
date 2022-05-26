package com.extremecoder;

import java.util.HashMap;
import java.util.HashSet;

public class Contains_Duplicate_578 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet hashSet = new HashSet();
        for (int num : nums) {
            if(hashSet.contains(num)) {
                return true;
            }
            hashSet.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{
                1,1,1,3,3,4,3,2,4,2
        }));
    }
}
