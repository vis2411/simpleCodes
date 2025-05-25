package predicates;

import java.util.function.Predicate;

public class PredicateJoin {
    public static void main(String[] args) {
        int[] x = {0,5,10,15,20,25,30};
        System.out.println("numbers greater than 10");
        Predicate<Integer> p1 = i->i>10;
        m1(p1,x);

        System.out.println("even numbers");
        Predicate<Integer>p2 = i->i%2==0;
        m1(p2,x);

        System.out.println("numbers not greater than 10");
        m1(p1.negate(),x);

        System.out.println("numbers greater than 10 and even");
        m1(p1.and(p2),x);

        System.out.println("numbers greater that 10 or even");
        m1(p1.or(p2),x);

    }
    public static void m1(Predicate<Integer>p , int[] x){
        for (int X1 : x){
            if(p.test(X1)){
                System.out.println(X1);
            }
        }
    }



    }



