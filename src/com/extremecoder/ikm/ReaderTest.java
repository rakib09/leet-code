//test
package com.extremecoder.ikm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReaderTest {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader inputStream = new FileReader("input.data");
       BufferedReader bf = new BufferedReader(new FileReader("input.data"));
    }
}
