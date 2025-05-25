package comeee;

public class Obects {
    public static void main(String[] args) {
        Obects  obects = new Obects();
        obects.m2();


    }

//    public void m2(){
//        inf1 I = ()->{
//            int x = 20;
//            System.out.println(x);
//            System.out.println(this.x);
//
//
//        };
//        I.m1();
//    }
int x = 10;
    public  void m2() {

        inf1 in = new inf1() {
            int x = 20;
            public void m1() {

//                System.out.println(x);
                System.out.println(this.x);
            }
        };
        in.m1();
    }
}

interface inf1 {
    public void m1();
}