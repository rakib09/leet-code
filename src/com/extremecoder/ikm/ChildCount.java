package com.extremecoder.ikm;

public class ChildCount extends ParentCount {
    public ChildCount() {
        count++;
    }


    public static void main(String[] args) {
        System.out.println("Count " + getCount());
        ChildCount ch = new ChildCount();
        System.out.println("Count " + getCount());
    }
}
