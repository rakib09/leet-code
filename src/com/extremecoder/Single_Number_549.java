package com.extremecoder;

import java.util.HashMap;
import java.util.Map;

public class Single_Number_549 {
    public static int singleNumber1(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n: nums) {
            if(map.containsKey(n)) {
                map.put(n, (map.get(n) + 1));
            } else {
                map.put(n, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0 ; i< nums.length ; i++)
        {
            res = res ^ nums[i];
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{
                4,1,3,1,2,3,2
        }));
        System.out.println(singleNumber1(new int[]{
                4,4,1,2,1,2,3,3
        }));
    }
}
