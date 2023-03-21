package com.extremecoder.data_structure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
                result[0] = i;
                result[1] = map.get(diff);
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
    }

}
