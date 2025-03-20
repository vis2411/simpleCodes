package com.java.practise.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElement {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("ABC", "ABC", "Asad", "gfds", "Asad"));
        Map<String,Long> a = arrayList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(a);

//        Map<String,Integer> frequency = new HashMap<>();
//        for (String s : arrayList){
//            if (frequency.containsKey(s)){
//                frequency.put(s,frequency.get(s) + 1);
//            }else {
//                frequency.put(s,1);
//            }
//        }
//        for (Map.Entry<String,Integer> entry : frequency.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }


    }
    }
