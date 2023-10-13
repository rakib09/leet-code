package com.extremecoder.ikm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class NameSorter {
    static class Namer {
        private String firstName, lastName;
        public Namer(String fsName, String lsName) {
            this.firstName = fsName;
            this.lastName = lsName;
        }
        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }

    public static void main(String[] args) {
        Consumer<Namer> printIt = e -> System.out.println(e.getFirstName() + " " + e.getLastName());
        List<Namer> names = new ArrayList<>(Arrays.asList(
                new Namer("Harry", "Smith"),
                new Namer("Joe", "Smith"),
                new Namer("Jane", "Doe"),
                new Namer("Mary", "Jane"),
                new Namer("Harry", "Homeowner")
        ));
        Comparator<Namer> groupBy = Comparator.comparing(e -> e.getFirstName());
        groupBy = groupBy.thenComparing(e -> e.getLastName());
        names.removeIf(e -> e.getFirstName().equals("Mary"));
        names.sort(groupBy);
        names.forEach(printIt);
    }
}
