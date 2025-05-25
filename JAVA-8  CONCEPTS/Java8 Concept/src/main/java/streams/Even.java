package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Even {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(0);l.add(50);l.add(1);l.add(15);l.add(20);l.add(25);
        l.stream().forEach(System.out::println);

        List<Integer> l5 = l.stream().sorted().collect(Collectors.toList());
        System.out.println(l5);
        List<Integer> l6 = l.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println(l6);

        Integer min = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(min);

       ArrayList<Integer> l1 = new ArrayList<>();
       for (Integer l2 : l){
           if (l2%2==0){
//               l1.add(l2);

           }
           l1.add(l2*2);
       }
//        System.out.println(l1);

       List<Integer> l3 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(l3);

        List<Integer> l4 = l.stream().map(i->i*2).collect(Collectors.toList());
//        System.out.println(l4);




    }
}
