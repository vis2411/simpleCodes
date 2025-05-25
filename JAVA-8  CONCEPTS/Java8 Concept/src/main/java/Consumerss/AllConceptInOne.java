package Consumerss;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class AllConceptInOne {
    public static void main(String[] args) {
        ArrayList<Student> l = new ArrayList<>();
        populate(l);
        Predicate<Student> p = s->s.marks>=60;
        Function<Student,String> f = s->{
            int marks = s.marks;
            if (marks>=80){
                return "A[Distinction]";
            } else if (marks>=60) {
                return "B[first class]";
            } else if (marks>=45) {
                return "C[second class]";
            }else if (marks>=35){
                return "D[just pass]";
            }else {
                return "F[fail]";
            }
        };

       Consumer<Student> c = s->{
           System.out.println("student name : " + s.name);
           System.out.println("student marks : " + s.marks);
           System.out.println("student grade : " + f.apply(s) );
       };

       for (Student s : l){
           if (p.test(s)){
               c.accept(s);
           }

       }
    }
    public static void populate(ArrayList<Student> l){
        l.add(new Student("Vish",56));
        l.add(new Student("thna",60));
        l.add(new Student("bunny",100));
        l.add(new Student("sunny",65));
        l.add(new Student("pinny",25));
    }
}

class Student{
    String name;
    int marks;

    Student(String name,int marks){
        this.name = name;
        this.marks = marks;
    }
}
