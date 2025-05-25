package predicates;

import java.util.function.Predicate;

public class MemberAllowedInPub {
    public static void main(String[] args) {
        SoftwareEngineer[] list = {
                new SoftwareEngineer("gani",24,true),
                new SoftwareEngineer("ranji",24,true),
                new SoftwareEngineer("abhi",24,false),
                new SoftwareEngineer("shivu",14,false),
                new SoftwareEngineer("siddu",12,true)
        };
        Predicate<SoftwareEngineer> p = i->i.age>18 && i.havingGf==true;
        System.out.println("the allowed members");
        for (SoftwareEngineer s : list){
            if (p.test(s)){
                System.out.println(s);
            }
        }


    }
}

class SoftwareEngineer{
    String name;
    int age;
    boolean havingGf;

    SoftwareEngineer(String name, int age, boolean havingGf){
        this.name =name;
        this.age = age;
        this.havingGf = havingGf;
    }

    public String toString(){
        return name;
    }
}
