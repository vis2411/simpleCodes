package com.java.practise;
public class Stringmarge {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
       String word1 = "abc";
       String word2 = "qwertyu";

       int n1 = word1.length();
       int n2 = word2.length();

       int i = 0;
       while (i<n1 || i<n2){
           if(i<n1){
                builder.append(word1.charAt(i));
           }
           if(i<n2){
               builder.append(word2.charAt(i));
           }
           i++;
       }
        System.out.println(builder.toString());

    }
}
