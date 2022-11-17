package com.extremecoder.data_structure;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class SingleNumber_136 {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> numsQuantities = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsQuantities.put(nums[i], (Optional.ofNullable(numsQuantities.get(nums[i])).orElse(0) + 1));
        }
        for (Map.Entry<Integer, Integer> entry :numsQuantities.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new SingleNumber_136().singleNumber(new int[] {2,2,1}));
    }
}
