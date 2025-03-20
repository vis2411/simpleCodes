package com.java.practise.Streams;

import java.util.List;
import java.util.stream.Collectors;

public class PrefixSufix {
    public static void main(String[] args) {
        List<String> list = List.of(" abx "," ead ");
//        String l = list.stream().collect(Collectors.joining("Delimiter ","Prefix ","Suffix "));
//        System.out.println(l);


        String s = list.stream().collect(Collectors.joining(" a " , " b " , " c "));
        System.out.println(s);
    }
}