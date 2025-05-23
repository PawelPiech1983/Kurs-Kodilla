package com.kodilla.stream.itereate;

import java.util.stream.Stream;

public class NumbersGenerator {

    public static void generateEven(int max) {
        Stream.iterate(1, n -> n + 1)
                .limit(max)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
