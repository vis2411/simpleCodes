package methodRef;

interface Inf {
    public void m1();
}

public class First {

    public static void m2(){
        System.out.println("method reference");
    }

    public static void main(String[] args) {
        Inf i = First::m2;
        i.m1();

    }
}
