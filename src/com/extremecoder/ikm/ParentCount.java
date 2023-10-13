package com.extremecoder.ikm;

public class ParentCount {
    protected static int count = 0;
    public ParentCount() {
        count++;
    }
    static int getCount() {
        return count;
    }
}
