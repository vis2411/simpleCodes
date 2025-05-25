package Consumerss;

import java.util.function.Function;

public class StringReverse {
    public static void main(String[] args) {
        String s = "Hello";
//        StringBuffer buffer = new StringBuffer(s);
//        System.out.println(buffer.reverse());

//        int i = s.length()-1;
//        System.out.println(i);
//        System.out.println(s.length());

        for (int j = s.length()-1; j >= 0; j--) {
           char c = s.charAt(j);
            System.out.print(c);
        }

//        while (i>=0){
//            System.out.print(s.charAt(i));
//            i--;
//        }

    }
}
