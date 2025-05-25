package premitiveInterfaces;

import java.util.function.IntConsumer;

public class IntConsum {
    public static void main(String[] args) {
        IntConsumer c = d-> System.out.println(d*d);
        c.accept(5);
    }
}
