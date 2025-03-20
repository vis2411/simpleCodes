package com.java.practise.Streams;

import java.util.List;

public class MultipleOfNum {
    public static void main(String[] args) {
        List<Integer> list = List.of(5,10,2,25,12,25,53,10);
//       list.stream().filter(i->i%5==0).forEach(System.out::println);


//list.stream().filter(i->i%2==0).sorted().distinct().skip(5).forEach(System.out::println);

        list.stream().filter(i->i%2==0).distinct().skip(5).forEach(System.out::println);
    }
}
