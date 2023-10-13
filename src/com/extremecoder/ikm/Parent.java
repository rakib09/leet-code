package com.extremecoder.ikm;

public class Parent {
    static {
        System.out.println("Parent static");
    }

    {
        System.out.println("Initializer block Parent");
    }

    public Parent() {
        System.out.println("Parent constructor");
    }
}
