package com.extremecoder.data_structure;

import java.util.*;

public class IntersectionofTwoArraysII_350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> common = new HashMap();
        for (int n: nums1){
            common.put(n, (common.getOrDefault(n, 0) +1));
        }
        List<Integer> result = new ArrayList<Integer>();
        for (int n: nums2) {
            if(common.containsKey(n) && common.get(n) > 0) {
                result.add(n);
                common.put(n, (common.get(n)-1));
            }
        }
        int[] resArray = new int[result.size()];
        for (int i = 0; i < resArray.length; i++) {
            resArray[i] = result.get(i);
        }
        return resArray;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{1,2,2,1}, new int[]{2,2})));
        System.out.println(Arrays.toString(intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }
}
