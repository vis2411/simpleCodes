package org.example.a;

class Parent {

    static String s = "parent";

    public Number property(){
        System.out.println("property method");
        return null;
    }
    public  Number marry(){
        System.out.println("mammalian");
        return null;
    }
}

class Child extends  Parent{

    String s = "child";

    public  Integer marry() {
        System.out.println("katarina");
        return null;
    }
}

public class imp{
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.marry();
        System.out.println(parent.s);
        Child child = new Child();
        child.marry();
        System.out.println(child.s);
        Parent parent1 = new Child();
        parent1.marry();
        System.out.println(parent1.s);
    }
}


