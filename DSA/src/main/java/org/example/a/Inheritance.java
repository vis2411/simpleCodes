package org.example.a;

public class Inheritance {
    public static void main(String[] args) {
        P a = new P();
        a.m1();
//        a.m2();  // on parent class reference we cannot call the child class methods

        C c = new C();
        c.m2();
        c.m1();  //on child class reference we can call both methods exist in parent n child class

        P s = new C();
        s.m1();
//        s.m2();
//        C c1 = new P();
    }
}
class P{
    public void m1(){

    }
}
class C extends P{
    public void m2(){

    }
}
