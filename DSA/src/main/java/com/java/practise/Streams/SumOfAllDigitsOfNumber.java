package com.java.practise.Streams;

public class SumOfAllDigitsOfNumber {
    public static void main(String[] args) {
        int num = 1234;
//        int sum = Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));
        String s = String.valueOf(num);
        s.split("");
        int sum = 0;
        for (int i = 0 ; i < s.length() ; i++){

            sum = sum + Character.getNumericValue(s.charAt(i));
        }
        System.out.println(sum);
    }

}
