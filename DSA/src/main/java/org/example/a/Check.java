package org.example.a;

public class Check {
//    public void m1(Object o){
//        System.out.println("Object version");
//    }
    public void m1(StringBuffer sb){
        System.out.println("stringBuffer version");
    }
    public void m1(String s){
        System.out.println("String version");
    }

    public void m1(int i){
        System.out.println("general method");
    }
    public void m1(int... i){
        System.out.println("var arg method");
    }

    public  void m1(int a, float b){
        System.out.println("inside 1st method");
    }
    public void m1(float c , int d){
        System.out.println("2nd method");
    }
    public static void main(String[] args) {
        Check check = new Check();
//        check.m1(new Object());
//        check.m1("vish");
//        check.m1(new StringBuffer("sh"));
//        check.m1("null");
//        check.m1(4);
//        check.m1();
//        check.m1(3,4,3,2,5,7);
        check.m1(5,5.9f);
        check.m1(6.3f,5);
//        check.m1(5f,5f);

    }
}
