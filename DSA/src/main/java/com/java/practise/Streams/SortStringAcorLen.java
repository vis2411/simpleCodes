package com.java.practise.Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStringAcorLen {
    public static void main(String[] args) {
        List<String> list = List.of("csdsfsdag","aefs","ber");
//        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);


        List<String> immutable = new ArrayList<>(list);
       Collections.sort(immutable,new Comparator<String>(){


           @Override
           public int compare(String s1, String s2) {
               return Integer.compare(s1.length(),s2.length());
           }
       });
        System.out.println(list);
    }
}
