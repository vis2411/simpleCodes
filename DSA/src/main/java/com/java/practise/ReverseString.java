package com.java.practise;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        String reverse = reverseString(str);
        System.out.println(reverse);

//        StringBuilder builder = new StringBuilder("hii");  //olleh
//        for (int i = 0; i<builder.length()/2 ; i++) {
//            int front = i;
//            int back = builder.length() - 1 - i;
//
//            char frontChar = builder.charAt(front);
//            char backChar = builder.charAt(back);
//
//            builder.setCharAt(front,backChar);
//            builder.setCharAt(back,frontChar);
//
//
//        }
//        System.out.println(builder);

    }
    static String reverseString(String a){
        StringBuilder builder = new StringBuilder();
        for(int i = a.length()-1;i>=0;i--){
            builder.append(a.charAt(i));
        }
        return builder.toString();
    }
}
