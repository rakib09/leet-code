package com.extremecoder.ikm;

public class OuterClass {
    public String outerPublic = "String Public";
    private String outerPrivate = "String Public";
    class InnerClass {
        public String inner = "Inner";

        public void print() {
            System.out.println(outerPublic);
            System.out.println(outerPrivate);
        }
    }
    public void print() {
        // not accessable System.out.println(inner);
    }
}
