package twoArgumentFunctionalInterface;

import java.util.function.BiConsumer;

public class BiCons {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> a = (s1,s2)-> System.out.println(s1+s2);
        a.accept(5,4);
    }
}
