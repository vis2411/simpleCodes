package com.java.practise.Streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MargeArray {
    public static void main(String[] args) {
       int a[] = {1,2,3,4,5,6,3,21,4,6,0,88,766};
       int b[] = {3,2,45643234,5476,23436,5};
//       int[] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b))
//               .sorted().distinct()
//               .toArray();
//        System.out.println(Arrays.toString(c));


        int [] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(c));




        }

}
