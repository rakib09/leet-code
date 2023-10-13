package com.extremecoder.ikm;

import java.io.*;

public class FileClass {
    FileClass() {
        System.out.println("File");
    }

    public static void main(String[] args) throws Exception {
        test();
    }

    public static void test() throws Exception {
        IKmTest i = new IKmTest("XYZ");
        FileOutputStream f = new FileOutputStream("data.txt");
        ObjectOutputStream o = new ObjectOutputStream(f);
        o.writeObject(i);
        o.close();

        FileInputStream fi = new FileInputStream("data.txt");
        ObjectInputStream oi = new ObjectInputStream(fi);
        IKmTest ik = (IKmTest) oi.readObject();
        System.out.println(ik.getName());
        oi.close();


    }
    static class IKmTest extends FileClass implements Serializable {
        private String name;
        IKmTest(String name) {
            this.name = name;
            System.out.println("Test");
        }
        public String getName() {
            return this.name;
        }
    }
}
