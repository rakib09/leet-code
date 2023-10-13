package com.extremecoder.ikm;

public class Ikm3 extends Parent{
    static {
        System.out.println("child static");
    }

    {
        System.out.println("child initializer");
    }

    public Ikm3() {
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        Ikm3 p = new Ikm3();
    }
}
