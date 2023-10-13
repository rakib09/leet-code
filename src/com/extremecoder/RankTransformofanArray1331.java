package com.extremecoder;

import java.util.*;

public class RankTransformofanArray1331 {
    public static int[] arrayRankTransform(int[] arr) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int number:arr) {
            treeSet.add(number);
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int rank = 0;
        for (int number:
             treeSet) {
            hashMap.put(number, ++rank);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = hashMap.get(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayRankTransform(new int[]{40,10,20,30})));
        System.out.println(Arrays.toString(arrayRankTransform(new int[]{100,100,100})));
        System.out.println(Arrays.toString(arrayRankTransform(new int[]{37,12,28,9,100,56,80,5,12})));
    }
}
