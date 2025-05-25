package twoArgumentFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiFunction;

public class BiFunctionArray {
    public static void main(String[] args) {
        BiFunction<String,Integer,Student> b = (name,marks)->new Student(name,marks);
        ArrayList<Student> list = new ArrayList<>();
        list.add(b.apply("vvv",60));
        list.add(b.apply("ddd",39));
        for (Student s : list){
            System.out.println("student name " + s.name);
            System.out.println("student marks " + s.marks);
        }
    }
}

class Student{
    String name;
    int marks;
    Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
}
