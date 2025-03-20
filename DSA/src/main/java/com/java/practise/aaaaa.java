package com.java.practise;

public class aaaaa {
    public static void main(String[] args) {
        String s = "AJbK";
//        String res = "";
//        for (int i = 0; i < s.length()-1; i++) {
//            if(Character.isLowerCase(s.charAt(i))) {
//                res = res + Character.toUpperCase(s.charAt(i));
//            }
//            else {
//                res = res + Character.toLowerCase(s.charAt(i));
//            }
//
//        }
//        System.out.println(res);




        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLowerCase(s.charAt(i))){
                res = res + Character.toUpperCase(s.charAt(i));
            }else {
                res = res + Character.toLowerCase(s.charAt(i));
            }
        }
        System.out.println(res);



    }

}
