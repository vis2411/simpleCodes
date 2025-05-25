package twoArgumentFunctionalInterface;

import java.util.function.BiPredicate;

public class BiPredicatee {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> predicatee = (a, b)-> (a+b)%2==0;
        System.out.println(predicatee.test(5,6));
        System.out.println(predicatee.test(6,6));
    }
}
