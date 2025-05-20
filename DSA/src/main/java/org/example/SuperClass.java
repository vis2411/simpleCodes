package org.example;

public class SuperClass {
    public int a;
    protected void m1(){
        System.out.println("hi");
    }
}

class ABub extends SuperClass{
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.m1();

        ABub ub = new ABub();
        ub.m1();

//        ABub aBub = (ABub) new SuperClass();
//        aBub.m1();

        SuperClass aBub1 = new ABub();
        aBub1.m1();
    }

}
