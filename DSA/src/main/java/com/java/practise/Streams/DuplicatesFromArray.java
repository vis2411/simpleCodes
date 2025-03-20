package com.java.practise.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicatesFromArray {
    public static void main(String[] args) {
        int [] arr = {24,43,1,1,5,6,2,4,2,1,4,6};
//        List<Integer> list = Arrays.asList(arr);
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(list);
        Integer a = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(a);



        List<Integer> duplicates = list.stream().collect(Collectors.groupingBy(i-> i,Collectors.counting()))
                .entrySet().stream()
                .filter(entry->entry.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(duplicates);
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));

            // Sample array
            Integer[] array = {1, 2, 3, 4, 2, 3, 5, 6, 3};
            // Convert array to a stream and find duplicates
            List<Integer> duplicate = Arrays.stream(array)
                    .collect(Collectors.groupingBy(i -> i, Collectors.counting()))  // Group by element and count occurrences
                    .entrySet().stream()  // Convert map entries to stream
                    .filter(entry -> entry.getValue() > 1)  // Filter out those with count > 1 (duplicates)
                    .map(Map.Entry::getKey)  // Extract the key (the element)
                    .collect(Collectors.toList());  // Collect results into a list
            // Output the duplicates
//            System.out.println("Duplicates: " + duplicates);
        }




        public static void reverse(int [] arr){
            int left = 0;
            int right = arr.length-1;

            while (left<right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }


        }



    }



