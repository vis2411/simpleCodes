package com.java.practise.Streams;

import java.util.stream.IntStream;

public class PalindromeUsingJava8 {
    public static void main(String[] args) {
        String n = "mam";
        int a = 121;
        boolean s = IntStream.range(0,n.length()/2).noneMatch(i->n.charAt(i) != n.charAt(n.length()-1));
        System.out.println(s);
    }
}
