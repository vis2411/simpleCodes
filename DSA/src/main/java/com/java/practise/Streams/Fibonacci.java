package com.java.practise.Streams;

import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
//        Stream.iterate(new int[] {0,1}, f->new int[] {f[1], f[0] + f[1] }).limit(10)
//                .map(f->f[0]).forEach(i-> System.out.println(i+ " "));



        Stream.iterate(new int[] {0,1}, f->new int[] {f[1], f[0]+ f[1]})
                .limit(7)
                .map(f->f[0]).forEach(i-> System.out.println(i+ " "));

        //fibonacciNum = 0 , 1 , 1 , 2 , 3 , 5 , 8
//        int n = 7;
//        int firstNum = 0;
//        int secondNum = 1;
//        int nextNum;
//        for (int i = 1 ; i<=n ; i++){
//            nextNum = firstNum + secondNum;
//            System.out.println(firstNum);
//            firstNum = secondNum;
//            secondNum = nextNum;



//        }





    }
}
