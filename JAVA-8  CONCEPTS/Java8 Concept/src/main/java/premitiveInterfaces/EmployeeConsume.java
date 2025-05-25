package premitiveInterfaces;

import java.util.ArrayList;
import java.util.function.ObjDoubleConsumer;

public class EmployeeConsume {
    public static void main(String[] args) {
        ArrayList<Employee> l = new ArrayList<Employee>();
        populate(l);
        ObjDoubleConsumer<Employee> o = (e,d)->e.salary =  (e.salary + d);
        for (Employee e : l){
            o.accept(e,500);
        }

        for (Employee e : l){
            System.out.println("employee name : "+e.name);
            System.out.println("employee salary : "+ e.salary);
            System.out.println();
        }
    }
    public static void populate(ArrayList<Employee> l){
        l.add(new Employee("aaa",500));
        l.add(new Employee("bbb",600));
        l.add(new Employee("eee",700));
    }
}
class Employee{
    String name;
    double salary;

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

}