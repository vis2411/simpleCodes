package com.java.practise.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,4,6,321,3,61,2,1));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(32,1,3,5,7,43,2));
//        list1.stream().filter(list2::contains).distinct().forEach(System.out::println);
        list1.addAll(list2);
//        System.out.println(list1);

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (Integer num: list1 ) {
            if(!seen.add(num)){
                duplicates.add(num);
            }

        }
        System.out.println(duplicates);
        

    }
}
