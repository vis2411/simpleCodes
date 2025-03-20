package com.java.practise.Streams;

public class SumNAvg {
    public static void main(String[] args) {
        int a[] = {3,5,2,6,8,3};
//        Double s = Arrays.stream(a).average().getAsDouble();
//        System.out.println(s);
//        System.out.println(a.length);
//          Arrays.stream(a).sorted().limit(1).forEach(System.out::println);
//          List<Integer> b = Arrays.stream(a).boxed().collect(Collectors.toList());
//          int b = Arrays.stream(a).sum();
//        System.out.println(b);
//        Double c = Arrays.stream(a).average().getAsDouble();
//        System.out.println(c);
        int num = a.length;
        double sum = 0;
        double avg = 0;
        for (int i = 0 ; i< num ; i++){
             sum = sum + a[i];
             avg = sum/num;



        }
        System.out.println(sum);
        System.out.println(avg);

    }
}
