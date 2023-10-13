package com.extremecoder.ikm;

public class SuperThis {
    private String name;
    private int age;
    public SuperThis(String name) {
        this(12);
        this.name = name;
    }

    public SuperThis(int age) {
        this.age = age;
        this.name = "test";
    }

    class Child extends SuperThis {

        public Child(int age) {
            this("name");
        }


        public Child(String name) {
            super(name);
        }
    }
}
