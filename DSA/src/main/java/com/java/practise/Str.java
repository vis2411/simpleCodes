package com.java.practise;

import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        int total = 0;

        for(int i = 0 ; i< size ; i++){
            array[i] = sc.next();
            total = total + array[i].length();
        }
        System.out.println(total);



    }




}
