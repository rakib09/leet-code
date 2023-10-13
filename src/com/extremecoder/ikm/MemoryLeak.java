package com.extremecoder.ikm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class MemoryLeak {
    static ArrayList<Integer> list = new ArrayList<Integer>(100);

    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(f);
            br.close();
            f.close(); // should add close
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
