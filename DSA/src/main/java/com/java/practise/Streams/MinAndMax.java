package com.java.practise.Streams;

import java.util.Collections;
import java.util.List;

public class MinAndMax {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = List.of(2, 3, 6, 2, 7, 4, 2, 6);
//        list.stream()
//                .sorted(Comparator.reverseOrder())
//                .distinct().peek(System.out::println).sorted(Comparator.reverseOrder()).limit(3)
//                .forEach(System.out::println);

        Integer min_value = Collections.min(list);
        Integer max_value = Collections.max(list);
        System.out.println(max_value);
        System.out.println(min_value);

    }
}