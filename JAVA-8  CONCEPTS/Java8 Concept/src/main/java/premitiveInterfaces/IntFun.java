package premitiveInterfaces;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class IntFun {
    public static void main(String[] args) {
        IntFunction<Integer> i = f->f*f;
        System.out.println(i.apply(2));

        ToIntFunction<String> s = f->f.length();
        System.out.println(s.applyAsInt("ABV"));

        IntToDoubleFunction d = f->Math.sqrt(f);
        System.out.println(d.applyAsDouble(4));

    }
}
