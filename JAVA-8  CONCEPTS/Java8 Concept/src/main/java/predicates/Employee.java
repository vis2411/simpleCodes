package predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {


    public static void main(String[] args) {
        ArrayList<Emp> employee = new ArrayList<>();
        populate(employee);

        Predicate<Emp> p = (em)->em.designation.equals("Manager");
        System.out.println("Manager Info");
        display(employee,p);

        Predicate<Emp>p1 = (em)->em.city.equals("Bangalore");
        System.out.println("Emp reside in bengalore");
        display(employee,p1);

        Predicate<Emp> p2 = (em)->em.salary<20000;
        System.out.println("Employee salary less than 20000");
        display(employee,p2);

        System.out.println("all managers from bengalore in pink slip");
        display(employee,p1.and(p));

        System.out.println("Employee whos eaither manager or having les than 20000 salary");
        display(employee,p.or(p2));

        System.out.println("Employee who are not manager");
        display(employee,p.negate());

    }



    public static void populate(ArrayList<Emp>list){
        list.add(new Emp("Durga","CEO",30000,"Hydrabad"));
        list.add(new Emp("Sunny","Manager",20000,"Hyderabad"));
        list.add(new Emp("Mallika","Manager",20000,"Bangalore"));
        list.add(new Emp("Kareena","Lead",15000,"Hyderabad"));
        list.add(new Emp("Katrina","Lead",15000,"Bangalore"));
        list.add(new Emp("Anushka","Developer",10000,"Hyderabad"));
        list.add(new Emp("Kanushka","Developer",10000,"Hyderabad"));
        list.add(new Emp("Sowmya","Developer",10000,"Bangalore"));
    }
    public static void display(ArrayList<Emp> list , Predicate<Emp>p){
        for (Emp e : list){
            if (p.test(e)){
                System.out.println(e);
            }
        }
        System.out.println("**************************************************");
    }


}


class Emp{
    String name;
    String designation;
    double salary;
    String city;

    Emp(String name,String designation,double salary, String city){
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    public String toString(){
        String s = String.format("[%s,%s,%.2f,%s]",name,designation,salary,city);
        return s;
    }




}
