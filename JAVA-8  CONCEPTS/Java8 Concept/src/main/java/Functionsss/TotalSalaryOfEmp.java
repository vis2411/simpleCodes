package Functionsss;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class TotalSalaryOfEmp {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        employees(list);
        System.out.println(list);

        Predicate<Employee> p = i-> i.salary<600;
        System.out.println("suggest for increment salary is less than 700 : ");
        for (Employee e : list){
            if (p.test(e)){
                System.out.println(e.name + " : " + e.salary);
            }
            Function<ArrayList<Employee>,Integer> fn = f->{
                int total = 0;
                 total = total + e.salary + 100;
                 return total;
            };
            System.out.println("after increment salary : "+ fn.apply(list));
        }

        Function<ArrayList<Employee>,Integer> emp = (i)->{
            int total = 0 ;
            for (Employee a : i) {

                    total = total + a.salary;
                }

            return total;
        };
        System.out.println("Before increment total salary =" + emp.apply(list));


    }

    public static void employees(ArrayList<Employee> list){
        list.add(new Employee("vishwa",1000));
        list.add(new Employee("chand", 500));
        list.add(new Employee("Abc",200));
        list.add(new Employee("dc",100));
    }
}

class Employee{
    String name;
    int salary;

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
        return name + " : " + salary;
    }
}
