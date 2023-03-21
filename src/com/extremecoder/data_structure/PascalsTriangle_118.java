package com.extremecoder.data_structure;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            List<Integer> item = new ArrayList<>();
            if(i == 0) {
                item.add(1);
            } else if( i == 1) {
                item.add(1);
                item.add(1);
            } else{
                item.add(1);
                for(int j = 1; j < i; j++) {
                    item.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
                item.add(1);
            }
            result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generate(5).toString());
    }
}
