package org.example;

abstract class Vehicle{
//    public abstract int bus();
//    public abstract int auto();
}

abstract class SubClass extends  Vehicle{


    public int bus() {
        return 6;
    }

}

class Sub extends SubClass {


    public int auto() {
        return 3;
    }
}
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Vehicle test = new Vehicle(){
//          public  int bus(){
//                return 6;
//            }
//          public int auto(){
//              return 3;
//          }
//        };
        Sub test = new Sub();
        int c =  test.bus();
        int d = test.auto();
        System.out.println(c);
        System.out.println(d);
    }
}