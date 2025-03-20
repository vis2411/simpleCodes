package com.java.practise.Streams;

import java.util.Arrays;

public class ReverseEachWordOfString {
    public static void main(String[] args) {
        String s = "ACBCD";
//        String reersed = Arrays.stream(s.split(" ")).map(a-> new StringBuffer(s).reverse()).collect(Collectors.joining(" "));
//        System.out.println(reersed);

        Arrays.stream(s.split(" ")).map(a->new StringBuffer(s).reverse()).forEach(System.out::println);



//        String a = "";
//        char c ;
//
//        for(int i =0   ; i<s.length(); i++){
//            c = s.charAt(i);
//            a = c + a;
//        }
//        System.out.println(a);





    }
}
