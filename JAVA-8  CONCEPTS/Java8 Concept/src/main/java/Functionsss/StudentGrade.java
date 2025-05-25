package Functionsss;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentGrade {
    public static void main(String[] args) {
        ArrayList<Student> l = new ArrayList();
        m1(l);
        Function<Student,String> f = (a)->{
            if (a.marks>80){
                return "A[Distinction]";
            } else if (a.marks>60) {
                return "B[First class]";
            } else if (a.marks>=35) {
                return "C[just-pass]";
            }else
                return "F[fail]";
        };


        Predicate<Student> a = s->s.marks>60;
        for (Student s : l) {

            if (a.test(s)) {

                System.out.println(s.name);
                System.out.println(s.marks);
                System.out.println(f.apply(s));
            }
        }




    }


    public static void m1(ArrayList<Student> l ){
        l.add(new Student("Che" ,  80));
        l.add(new Student("Vish" , 90) );
        l.add(new Student("pra", 36));
        l.add(new Student("salman", 34));
        l.add(new Student("Akash", 58));
    }
}

class Student{
    String name;
    int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}