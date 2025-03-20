package com.java.practise.Streams;

import java.util.Arrays;
import java.util.List;

public class ListIntoReverse {
    public static void main(String[] args) {
//        List<String> list = List.of("zzz","aaa","fff","ddd");
        List<Integer> list = Arrays.asList(3,2,43,9,3,895,2,6);
        for (int i = list.size()-1; i>=0; i--){
            System.out.println(list.get(i));
        }

//        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
