package org.example.a;

public class ovrlosdin {
    final void a(){
        System.out.println("hi");
    }
     void a(int a){
        System.out.println("hlo");
    }
    public static void main(String[] args) {
//        ovrlosdin ovrlosdin = new ovrlosdin();
//        ovrlosdin.a();
//        ovrlosdin.a(5);

//        Object o = new String("fdd");
//        String sb = (String) o;
//        System.out.println(sb==o);
        D d = new D();
        d.m1();
        ((B)d).m1();
        ((A)((B)d)).m1();

        System.out.println(d.a);
        System.out.println(     ((B)d).a               );
        System.out.println(            ((A)((B)d)).a                 );
    }
}
class A{
    int a = 333;
    public static void m1(){
        System.out.println("A");
    }
}
class B extends  A{
    int a = 222;
    public static void m1(){
        System.out.println("B");
    }
}
class D extends  B {
    int a = 555;
    public static void m1(){
        System.out.println("C");
    }
}
