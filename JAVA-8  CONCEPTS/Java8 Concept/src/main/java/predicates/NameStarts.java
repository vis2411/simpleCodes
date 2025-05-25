package predicates;

import java.util.Arrays;
import java.util.function.Predicate;

public class NameStarts {
    public static void main(String[] args) {
        String s[] = {"Kempa","King","sdfs","rewe","kfdc"};
        Predicate<String> p = (i)->i.startsWith("sd");
        System.out.println("word starts with k : ");
    for (String s1 : s){
            if(p.test(s1)){
                System.out.println(s1);
            }
        }

    }


}
