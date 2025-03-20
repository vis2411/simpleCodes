package com.java.practise.Streams;

import java.util.Collections;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> list = List.of(43,2,5,84,32,6,3,56,3);
//        Integer a = list.stream().max(Comparator.naturalOrder()).get();
//        Integer b = list.stream().min(Comparator.naturalOrder()).get();
//        System.out.println(a);
//        System.out.println(b);
//          List<Integer> a = list.stream().sorted().limit(1).collect(Collectors.toList());
//        System.out.println(a);
//          List<Integer> b = list.stream().sorted(Comparator.reverseOrder()).findFirst().stream().collect(Collectors.toList());
//        System.out.println(b);


        Integer min_num = Collections.min(list);
        Integer max_num = Collections.max(list);
        System.out.println(min_num);
        System.out.println(max_num);

    }
}
