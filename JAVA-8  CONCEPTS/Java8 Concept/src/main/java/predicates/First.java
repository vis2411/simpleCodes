package predicates;

import java.util.function.Predicate;

public class First{

    public static void main(String[] args) {
//        System.out.println(First.test(10));
//        First first = new First();
//        System.out.println(first.test(20));
        Predicate<Integer> p = (I)-> I>10;
//        System.out.println(p.test(1));



    }

}
