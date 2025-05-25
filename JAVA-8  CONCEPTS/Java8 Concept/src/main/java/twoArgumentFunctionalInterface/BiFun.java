package twoArgumentFunctionalInterface;

import java.util.function.BiFunction;

public class BiFun {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> function =
                (a,b)->(a*b);
        System.out.println(function.apply(4,5));
    }
}
