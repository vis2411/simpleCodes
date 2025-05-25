package predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class NotnullValue {
    public static void main(String[] args) {
        String names[] = {"",null,"tre","",null,"ghf"};
        Predicate<String> p = s->s!=null && s.length()!=0;
        ArrayList<String> arrayList = new ArrayList();
        for (String s : names){
            if (p.test(s)){
//                System.out.println(s);
                arrayList.add(s);
            }
        }
        System.out.println(arrayList);
    }
}
