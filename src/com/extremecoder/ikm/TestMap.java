package com.extremecoder.ikm;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class TestMap {
    public static void main(String[] args) {
        Collector<String, ?, TreeMap<Integer, String>> myCollector = Collector.of(
                TreeMap::new,
                (s, t) -> s.put(t.length(), t.toLowerCase()),
                (x,y) -> {x.putAll(y); return x;}
        );
        TreeMap<Integer, String> col1;
        col1 = Stream.of("Bob", "Carol", "Ted", "Bob", "Alice")
        .collect(myCollector);
        col1.forEach((integer, s) -> System.out.println(integer + ":" + s));

        Collector<String, ?, HashMap<Integer, String>> myCollector2 = Collector.of(
                HashMap::new,
                (s, t) -> s.put(t.length(), t.toLowerCase()),
                (x,y) -> {x.putAll(y); return x;}
        );
        TreeMap<Integer, String> col2;
        col2 = Stream.of("Bob", "Carol", "Ted", "Bob", "Alice")
                .collect(myCollector);
        col2.forEach((integer, s) -> System.out.println(integer + ":" + s));

        Collector<String, ?, AbstractMap<Integer, String>> myCollector3 = Collector.of(
                TreeMap::new,
                (s, t) -> s.put(t.length(), t.toLowerCase()),
                (x,y) -> {x.putAll(y); return x;}
        );
        TreeMap<Integer, String> col3;
        col3 = Stream.of("Bob", "Carol", "Ted", "Bob", "Alice")
                .collect(myCollector);
        col3.forEach((integer, s) -> System.out.println(integer + ":" + s));
    }
}
