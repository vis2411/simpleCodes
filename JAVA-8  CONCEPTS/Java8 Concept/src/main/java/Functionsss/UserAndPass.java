package Functionsss;

import java.util.Scanner;
import java.util.function.Function;

public class UserAndPass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter user name");
        String userName = sc.next();
        System.out.println("enter password");
        String password = sc.next();

        Function<String, String> f = s->s.toLowerCase();
        Function<String,String> f1 = s->s.substring(0,5);
        if (f.andThen(f1).apply(userName).equals("vishw") && password.equals("java")  ){
            System.out.println("valid user");
        }else {
            System.out.println("invalid user");
        }

        Function<String , String> f3 = Function.identity();
        String s = f3.apply("Hi");
        System.out.println(s);

    }
}
