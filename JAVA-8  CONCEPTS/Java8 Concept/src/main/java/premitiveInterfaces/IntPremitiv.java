package premitiveInterfaces;

import java.util.function.IntPredicate;

public class IntPremitiv {
    public static void main(String[] args) {
        int[] x = {5,10,15,20,25,30};
        IntPredicate i = p->p%2==0;
        for (int a : x){
            if (i.test(a)){
                System.out.println(a);
            }
        }
    }
}
