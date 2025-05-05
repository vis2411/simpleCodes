package dsa.strings;

import java.util.Scanner;

public class ReplaceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";

//        for (int i = 0 ; i< str.length(); i++){
//            if (str.charAt(i)=='e'){
//                res = res + 'i';
//            }else {
//                res = res + str.charAt(i);
//            }
//
//        }

        for (int i = 0 ; i < str.length() ; i++){
            if (str.charAt(i)=='@'){
                break;
            }else {
                res = res + str.charAt(i);
            }
        }


        System.out.println(res);
    }
}
