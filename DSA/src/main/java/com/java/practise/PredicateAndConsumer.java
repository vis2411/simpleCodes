package com.java.practise;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumer {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num->num%2==0;
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(5));

        Consumer<String> toUpper = str-> System.out.println(str.toLowerCase());
        toUpper.accept("ABC");
        Consumer<String> toUpper1 = str-> System.out.println(str.toUpperCase());
        toUpper1.accept("asdfg");


    }
}
