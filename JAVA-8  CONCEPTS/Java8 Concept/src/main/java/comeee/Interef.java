package comeee;

public class Interef implements Left,Right {
    public static void main(String[] args) {
            Interef interef = new Interef();
            interef.m1();
            Left.m2();
    }

//    @Override
    public void m1() {
//        System.out.println("my own implimentation");
        Left.super.m1();
    }
}

interface Left{
    default void m1(){
        System.out.println("left method");
    }
    public static void m2(){
        System.out.println("aassd");
    }
}
interface Right {
    default void m1(){
        System.out.println("right method");
    }
}

