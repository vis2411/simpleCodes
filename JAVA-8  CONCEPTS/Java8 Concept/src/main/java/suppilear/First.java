package suppilear;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class First {
    public static void main(String[] args) {
        Supplier<String> s = ()->{
            String[] str = {"aaa","bbb","ccc","ddd"};
            int a = (int) (Math.random()*3);
            return str[a];
        };
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());


        Supplier<Date> d = ()->new Date();
        System.out.println(d.get());

    }
}
