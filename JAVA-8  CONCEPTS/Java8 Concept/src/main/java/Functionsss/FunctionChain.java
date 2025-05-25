package Functionsss;

import java.util.function.Function;

public class FunctionChain {
    public static void main(String[] args) {
//        Function<String,String> f1 = f->f.toUpperCase();
//        Function<String,String> f2 = f->f.substring(0,9);
//        Function<String,String> f3 = f->f.substring(0,5);
//        System.out.println(f1.apply("abcdefghij"));
//        System.out.println(f2.apply("abcdefghij"));
//        System.out.println(f1.andThen(f2).apply("abcdefghij"));
//        System.out.println(f1.compose(f3).apply("abcdefghij"));


        Function<Integer,Integer> f4 = i->i+i;
        Function<Integer,Integer>f5 = i->i*i*i;
        System.out.println(f4.andThen(f5).apply(2));
        System.out.println(f4.compose(f5).apply(2));

    }
}
