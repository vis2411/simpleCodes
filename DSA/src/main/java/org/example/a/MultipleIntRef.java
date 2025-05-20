package org.example.a;

interface P1 {
    void m1();
}

interface P2{
    void m1();
}
interface P3 extends P1,P2{

}
public class MultipleIntRef implements P3{

    @Override
    public void m1() {
        System.out.println("Hi");
    }


    public static void main(String[] args) {
        P1 p1 = new MultipleIntRef();
        p1.m1();

        P2 p2 = new MultipleIntRef();
        p2.m1();
    }
}
