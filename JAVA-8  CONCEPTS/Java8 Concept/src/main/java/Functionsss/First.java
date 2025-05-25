package Functionsss;

import java.util.function.Function;

public class First {
    public static void main(String[] args) {
        Function<String,Integer> a = s->s.length();
        System.out.println(a.apply("abc"));
        Function<Integer,Integer> b = d->d*d;
        System.out.println(b.apply(5));
    }
}
