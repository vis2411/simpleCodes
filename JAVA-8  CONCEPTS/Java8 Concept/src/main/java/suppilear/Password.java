package suppilear;

import java.util.function.Supplier;

public class Password {
    public static void main(String[] args) {
        Supplier<String> s = ()->{
            String symbol = "POIUYTREWQLKJHGFDSAMNBVCXZ@#$%";
            Supplier<Integer> i = ()-> (int)(Math.random()*10);
            Supplier<Character> c = ()->symbol.charAt((int)(Math.random()*30));
            String password="";
            for (int j = 1 ; j<=8 ; j++){
                if(j%2==0){
                    password = password + i.get();
                }else {
                    password = password + c.get();
                }
            }
            return password;
        };
        System.out.println(s.get());

    }
}
