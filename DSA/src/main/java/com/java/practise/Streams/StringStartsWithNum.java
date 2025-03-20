package com.java.practise.Streams;

import java.util.ArrayList;
import java.util.List;

public class StringStartsWithNum {
    public static void main(String[] args) {
        List<String> list = List.of("1fds","2rfdc","gvfdc");
//        list.stream().filter(str->Character.isDigit(str.charAt(0))).forEach(System.out::println);
        List<String> wordStartsWithDigit = new ArrayList<>();
        for (String s : list){

            if (Character.isDigit(s.charAt(0))){
                    wordStartsWithDigit.add(s);
                System.out.println(s);
            }
        }

    }
}
