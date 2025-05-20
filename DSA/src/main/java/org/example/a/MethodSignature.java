package org.example.a;

public class MethodSignature {
    public void m1(int a){
        System.out.println("utyre");
    }
    public void m1(float b){
        System.out.println("fds");
    }
    public static void main(String[] args) {
        MethodSignature methodSignature = new MethodSignature();
        methodSignature.m1(1);
        methodSignature.m1(10l);
//        methodSignature.m1(10);
        methodSignature.m1('c');

    }
}
