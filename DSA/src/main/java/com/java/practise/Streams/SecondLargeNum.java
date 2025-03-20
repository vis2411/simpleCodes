package com.java.practise.Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargeNum {
    public static void main(String[] args) {
//        List<Integer> list =  List.of(2,4,2,4,6,4,36,34,3,6,3);
        Integer a[] = {2,34,5,7,32,4,64,3};
        int b[] = {2,34,5,7,32,4,64,3};
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println(a[1]);

        for (int i = 0 ; i<a.length;i++) {
            Arrays.sort(a, Collections.reverseOrder());
            System.out.println(a[1]);
            break;
        }

         List<Integer> list = Arrays.stream(b).boxed().collect(Collectors.toList());
         Integer c = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(c);

//        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
//        Integer b = list.stream().sorted(Comparator.reverseOrder()).skip(3).findFirst().get();
//        System.out.println(b);
//        System.out.println("third highest array is " + thirdHighest(a));


        }
//        public static int thirdHighest(Integer [] b){
//        Arrays.sort(b, Collections.reverseOrder());
//        return b[2];
//        }


}
