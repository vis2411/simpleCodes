package com.java.practise.Streams;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        int a[] = {5,4,2,6,3,4,9};
//        int b[] = IntStream.rangeClosed(1,a.length).map(i->a[a.length-i]).toArray();
//        System.out.println(Arrays.toString(b));


        int [] b = IntStream.range(1,a.length).map(i->a[a.length-1]).toArray();
        System.out.println(Arrays.toString(b));
        int max = findMax(a);
        System.out.println(max);


    }
    public static int findMax(int b[]){
        int maxNum = b[0];
        for(int num : b){
            if (num>maxNum){
                maxNum=num;
            }
        }
        return maxNum;
    }

}
