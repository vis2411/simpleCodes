package com.java.practise.Streams;

import java.util.List;
import java.util.stream.Collectors;

public class LastElementOfArray {
    public static void main(String[] args) {
        List<Integer> list = List.of(3,2,43,9,3,895,2,6);
//        List<Integer> a= Collections.singletonList(list.stream().skip(list.size() - 1).findFirst().get());
//        System.out.println(a);
//        int index = (list.size())-1;
//        System.out.println(list.get(7));
//        System.out.println(list.get(index));

        List<Integer> a = list.stream().skip(list.size()-8).collect(Collectors.toList());
        System.out.println(a);


    }
}
