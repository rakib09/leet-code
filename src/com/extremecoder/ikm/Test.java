package com.extremecoder.ikm;

import java.math.BigDecimal;
import java.util.Locale;

public class Test {
    interface test {
        BigDecimal findRoot(BigDecimal number);

    }
    synchronized BigDecimal findRoot1(BigDecimal number) {
        return new BigDecimal(12);
    }
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        Locale locale1 = Locale.forLanguageTag("zh-CN");
        Locale locale2 = new Locale.Builder().setLanguage("en").setRegion("GB").build();

        Locale locale3 = new Locale("USA");
        System.out.println("Country: " + locale3.getCountry());
    }
}
