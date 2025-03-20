package com.java.practise.Streams;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = List.of(11,2,2,2,3,4,3,5,2);
        list.stream().distinct().forEach(System.out::println);

    }
}
