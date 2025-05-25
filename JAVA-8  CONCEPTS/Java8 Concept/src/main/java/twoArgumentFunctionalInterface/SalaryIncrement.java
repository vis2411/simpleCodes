package twoArgumentFunctionalInterface;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class SalaryIncrement {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        BiFunction<String, Double, Employee> function = (name, salary) -> new Employee(name, salary);
            list.add(function.apply("aaa",543.0));
            list.add(function.apply("ddd",543.0));
            list.add(function.apply("sss",654.0));


        for (Employee e : list){
            System.out.println("Employee name : " + e.name);
            System.out.println("Employee salary : " + e.salary);
            System.out.println();

        }


        BiConsumer<Employee,Double> consumer = (e,increment)->e.salary = e.salary + increment;
        for (Employee e : list){
            consumer.accept(e,500.0);
        }

        for (Employee e : list){
            System.out.println("Employee " + e.name );
            System.out.println("salary increment " + e.salary);
            System.out.println();
        }


    }

}

class Employee{
    String name;
    Double salary;

    Employee(String name, Double salary){
        this.name = name;
        this.salary = salary;
    }

}