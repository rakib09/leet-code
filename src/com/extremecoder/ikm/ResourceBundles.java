package com.extremecoder.ikm;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundles {
    public static void main(String[] args) {
        ResourceBundle boundle = ResourceBundle.getBundle("message", new Locale("zh", "CN"));
    }
}
