package predicates;

import java.util.function.Predicate;

public class Second {
    public static void main(String[] args) {
        Predicate<String> p = (s)->(s.length()>3);
        System.out.println(p.test("abcdfd"));
    }
}
