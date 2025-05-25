package comeee;

public class Addition {
    public static void main(String[] args) {
//        Inf c = (int a , int b)-> System.out.println("sum is =" + (a+b) );
//        c.m1(5,10);

//        Inf a =  s -> s.length();
//        System.out.println(a.sq("Hello"));
        Inf inf = new A();
        System.out.println(inf.sq("Hello"));
    }
}

interface Inf{
//    public void m1(int a , int b);
    public int sq(String s);
}

class A implements Inf{

    @Override
    public int sq(String s) {
        return s.length();
    }
}