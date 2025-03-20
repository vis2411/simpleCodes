package com.java.practise.Streams;

import java.util.stream.IntStream;

public class SumOfNum {
    public static void main(String[] args) {
        int n ;
        n = IntStream.range(1,3).sum();
        System.out.println(n);

        int y = IntStream.range(1,4).sum();
        System.out.println(y);
        int sum = 0;
        for (int i = 0 ; i<4 ; i++ ){

            sum = sum + i;
        }
        System.out.println(sum);
    }
}
