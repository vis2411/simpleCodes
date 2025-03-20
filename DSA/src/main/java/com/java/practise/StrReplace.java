package com.java.practise;

import java.util.Scanner;

public class StrReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";

       for(int i = 0; i< s.length() ; i++){
            if(s.charAt(i) == 'e'){
                result = result + 'b';

            }
            else{
                result = result + s.charAt(i);
            }

        }
        System.out.println(result);
    }
}
