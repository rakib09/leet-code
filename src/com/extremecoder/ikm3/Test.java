package com.extremecoder.ikm3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class Test{
  static class Person {
      String name;
      Integer id;
              Person(String n, Integer id) {
                  name = n;
                  this.id = id;
              }
              Person(int id) {
                  this.name = null;
                  this.id = id;
              }
              public String toString() {
                  return name + " " + id;
              }
  }
    static List<Person> list = Arrays.asList(new Person("Bod", 1),
            new Person(2),
            new Person("Jane", 3));
    static int x;
    public static void main(String[] args) {
        list.stream().reduce((e1,e2) ->
        {
            x = e1.id;
            if(e1.id > e2.id) {
                System.out.println(e1);
                return e1;
            }
            x = e2.id;

                System.out.println(e2);
                return e2;


        }).flatMap(e -> Optional.ofNullable(e.name))
                .map(y -> new Person(y,x)).ifPresent(System.out::println);
    }


}
