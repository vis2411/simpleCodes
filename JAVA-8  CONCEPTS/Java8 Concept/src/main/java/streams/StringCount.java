package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringCount {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("jhgfds");
        l.add("jhgfdf");
        l.add("uytrew");
        l.add("utr");

        long l1 =  l.stream().filter(i->i.length()>5).count();
        System.out.println(l1);

        List<String> l2 = l.stream().map(i->i.toUpperCase()).filter(i->i.length()<=5).collect(Collectors.toList());
        System.out.println(l2);
    }
}
