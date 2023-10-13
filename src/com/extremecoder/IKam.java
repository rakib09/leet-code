package com.extremecoder;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class IKam {
    static void populate(Supplier<List> s, String... staff) {
        List l = s.get();
        for (int i = 0; i < staff.length; i++) {
            l.add(staff[i]);
        }
        System.out.println(l);
    }
    public static void main(String[] args) {
        IKam ikm = new IKam();
        populate(ArrayList::new, "Red", "Green", "Blue");
    }
}
