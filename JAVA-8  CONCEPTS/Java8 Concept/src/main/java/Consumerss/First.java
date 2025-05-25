package Consumerss;

import java.util.function.Consumer;

public class First {
    public static void main(String[] args) {
        Consumer<String> c = s-> System.out.println(s);
        c.accept("Hi");
        c.accept("Bye");
    }
}
