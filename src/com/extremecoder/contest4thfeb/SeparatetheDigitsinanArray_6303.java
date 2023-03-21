package com.extremecoder.contest4thfeb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparatetheDigitsinanArray_6303 {
    public static int[] separateDigits(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int item : nums) {
            int length = String.valueOf(item).length();
            for (int i= (length-1); i >= 0; i--) {
                result.add((int) (item / (Math.pow(10, i))));
                item = (int) (item % (Math.pow(10, i)));
            }
        }
        return result.stream().mapToInt(value -> value).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(separateDigits(new int[] {134,25, 9})));
        System.out.println(Arrays.toString(separateDigits(new int[] {13,25,83,77})));
        System.out.println(Arrays.toString(separateDigits(new int[] {7,1,3,9})));
    }
}
