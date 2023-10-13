package com.extremecoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        char[] strArray = s.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }

        int res = 0;

        for (Map.Entry<Character,Integer> entry : charCountMap.entrySet()){
            if(entry.getValue() % 2 != 0){
                res++;
            }
        }

        System.out.println(res-1);

    }
}