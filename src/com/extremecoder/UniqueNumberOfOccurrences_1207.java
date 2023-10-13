package com.extremecoder;

import java.util.*;

public class UniqueNumberOfOccurrences_1207 {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int number:
             arr) {
            if (map.containsKey(number)) {
                map.put(number, (map.get(number) + 1));
            } else {
                map.put(number, 1);
            }
        }
        HashSet<Integer> set = new HashSet<>(map.values());
        return set.size() == map.size();
    }

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[] {1,2,2,1,1,3}));
        System.out.println(uniqueOccurrences(new int[] {1,2}));
        System.out.println(uniqueOccurrences(new int[] {-3,0,1,-3,1,1,1,-3,10,0}));
    }
}
