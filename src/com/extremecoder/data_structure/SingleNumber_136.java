package com.extremecoder.data_structure;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class SingleNumber_136 {

    //Using HashMap Operation O(n) &  Memory (n)
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

    // Using XOR Operation O(n) & Memory: one int variable
    public int singleNumber2(int[] nums) {
        int res = 0;
        for (int i = 0 ; i< nums.length ; i++)
        {
            res = res ^ nums[i];
        }
        return res;
    }
    // Using XOR Operation O(n) & Memory: one int variable
    public int singleNumber3(int[] nums) {
        int res = 0;
        for (int i = 0 ; i< nums.length ; i++)
        {
            res = res ^ nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new SingleNumber_136().singleNumber(new int[] {4,1,2,1,2}));
        System.out.println(new SingleNumber_136().singleNumber2(new int[] {4,1,2,1,2}));
    }
}
