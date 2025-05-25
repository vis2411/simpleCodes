package Functionsss;

import java.util.function.Function;

public class Second {
    public static void main(String[] args) {
        String s = "AB cd df dd";
        Function<String,String> a = d->d.replaceAll(" ","");
        System.out.println(a.apply(s));

        Function<String,Integer> c = e->e.length()-e.replaceAll(" ","").length();
        System.out.println(c.apply(s));
    }
}
