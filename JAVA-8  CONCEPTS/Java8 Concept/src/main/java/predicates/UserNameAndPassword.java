package predicates;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserNameAndPassword {
    public static void main(String[] args) {
        Predicate<User> p = i-> i.userName.equals("Vish") && i.password.equals("java");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String username = sc.next();
        System.out.println("Enter password");
        String password = sc.next();
        User user = new User(username,password);

        if (p.test(user)){
            System.out.println("valid user");
        }else {
            System.out.println("invalid user");
        }

    }
}
class User{
    String userName;
    String password;
    User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
}
