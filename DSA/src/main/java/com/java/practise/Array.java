package com.java.practise;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Integer [] arr = new Integer[size];

        int x = sc.nextInt();

        for (int i = 0 ; i< size ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i< arr.length; i++){
            if(arr[i]==x){
                System.out.println("x found at index : " + i);
            }
        }
    }

} 