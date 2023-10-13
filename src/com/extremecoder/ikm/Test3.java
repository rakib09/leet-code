package com.extremecoder.ikm;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Random;

public class Test3 {


    public static void main(String[] args) throws InterruptedException {
       Thread t = new Thread();
       t.start();
        System.out.println("rw1");
        t.wait(10000);
        System.out.println("re2");
    }
}
