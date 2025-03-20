package com.java.practise;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "aaaa";
        StringBuilder builder = new StringBuilder(str);
        for (int i = 0; i < str.length()/2; i++) {
            int front = 0 ;
            int back = str.length()-1-i;

            char frontChar = builder.charAt(front);
            char backChar = builder.charAt(back);

            builder.setCharAt(front,backChar);
            builder.setCharAt(back,frontChar);

        }

        String s = builder.toString();

        if(s.equals(str)){
            System.out.println("palindrome");
        }else {
            System.out.println("noh");
        }

    }
}
