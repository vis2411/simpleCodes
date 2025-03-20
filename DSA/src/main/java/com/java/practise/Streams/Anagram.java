package com.java.practise.Streams;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";
        if(anagramCheck(str1,str2)){
            System.out.println("anagram");
        }else {
            System.out.println("no");
        }
//        String s1 = Stream.of(str1.split(""))
//                .map(String::toLowerCase)
//                .sorted().collect(Collectors.joining());
//        String s2 = Stream.of(str2.split(""))
//        .map(String::toLowerCase)
//        .sorted().collect(Collectors.joining());
//        System.out.println(s1);
//        System.out.println(s2);
//        if(s1.equals(s2)){
//            System.out.println("Anagram");
//        }else {
//            System.out.println("not a anagram");
//        }


    }
    public static boolean anagramCheck(String s1, String s2){
         s1 = s1.replaceAll("\\s","").toLowerCase();
         s2 = s2.replaceAll("\\s","").toLowerCase();

            if (s1.length() != s2.length()){
                return false;
            }

            char[] char1 = s1.toCharArray();
            char[] char2 = s2.toCharArray();
            Arrays.sort(char1);
            Arrays.sort(char2);
            return Arrays.equals(char1,char2);
    }
}
