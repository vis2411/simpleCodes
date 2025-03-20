package com.java.practise.Streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        List<Integer> list = List.of(23,2,4,65,4,32,67,45,44,86);
          Map<Boolean,List<Integer>>  partionMap =list.stream().distinct().sorted().collect(Collectors.partitioningBy(i->i%2==0));
          List<Integer> odd = partionMap.get(false);
          List<Integer> reversed = odd.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reversed);
          List<Integer> even = partionMap.get(true);
        System.out.println(odd);
        System.out.println(even);

    }
}
