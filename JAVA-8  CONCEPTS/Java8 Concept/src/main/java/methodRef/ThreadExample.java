package methodRef;


public class ThreadExample {
    public static void main(String[] args) {
//        Runnable r = ()->{
//            for (int i = 0 ; i<10 ; i++){
//                System.out.println("Child tread ");
//            }
//        };
//        Thread t = new Thread(r);
//        t.start();
//        for (int i = 0 ; i<10 ; i++) {
//            System.out.println("main thread ");
//        }
        ThreadExample example = new ThreadExample();
        Runnable r = example::m1;
        Thread thread = new Thread(r);
        thread.start();
        for (int i = 0 ; i<10 ; i++){
            System.out.println("main tread");
        }

    }
    public void m1(){
        for(int i = 0 ; i< 10 ; i++){
            System.out.println("Child thread");
        }
    }
}
