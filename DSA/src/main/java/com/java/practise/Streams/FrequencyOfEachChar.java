package com.java.practise.Streams;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachChar {
    public static void main(String[] args) {
//        List<String> list = List.of("Banana","Apple","Cat");
        String s = "Banana";
//        Map<Character, Long> a = s.chars()
//                .mapToObj(c->(char)c)
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println(a);


        Map<Character,Integer> frequency = new HashMap<>();
        for (char C: s.toCharArray()){
            if (frequency.containsKey(C)){
                frequency.put(C,frequency.get(C)+1);
            }else {
                frequency.put(C,1);
            }
        }
        for (Map.Entry<Character,Integer> entry : frequency.entrySet()){
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }


    }
}
