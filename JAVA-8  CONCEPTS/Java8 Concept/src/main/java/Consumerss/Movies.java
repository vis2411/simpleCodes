package Consumerss;
import java.util.ArrayList;
import java.util.function.Consumer;
public class Movies {
    public static void main(String[] args) {
        ArrayList<Inf> list = new ArrayList<>();
        m1(list);
        Consumer<Inf> consumer = s-> {
            System.out.println("movie name " + s.movieName);
            System.out.println("hero name " + s.hero);
            System.out.println("heroine name " + s.heroine);
        };
        for (Inf s : list){
            consumer.accept(s);
        }


    }
    public static void m1(ArrayList<Inf> l){
        l.add(new Inf("Ega","sudeep","dont no"));
        l.add(new Inf("Bahubali","Prabhas","tamanna"));
        l.add(new Inf("vishnu","sudeep","sai"));
    }

}


class Inf{
    String movieName;
    String hero;
    String heroine;

    Inf(String movieName,String hero , String heroine){
        this.movieName = movieName;
        this.hero = hero;
        this.heroine  = heroine;
    }

}
