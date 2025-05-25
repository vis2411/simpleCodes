package Consumerss;

import java.util.function.Consumer;

public class ConsumerChain {
    public static void main(String[] args) {
        Consumer<Movie> c1 = s->
            System.out.println("Movie : " + s.name + "is ready to release");

        Consumer<Movie> c2 = s->
                System.out.println("Movie : " + s.name + "is just released" + s.result);

        Consumer<Movie> c3 = s->
                System.out.println("Movie : " + s.name + "Information storing in database ");


        Consumer<Movie> chained = c1.andThen(c2).andThen(c3);

        Movie m1 = new Movie("bahubali", "hit");
        chained.accept(m1);

        Movie m2 = new Movie("son of saty","flop");
        chained.accept(m2);



    }



}

class Movie{
    String name;
    String result;

    Movie(String name, String result){
        this.name= name;
        this.result = result;
    }

}
