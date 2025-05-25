package comeee;

public class ThreadsDemo {
    public static void main(String[] args) {
//        Runnable runnable = new MyRunnable();
//        Thread thread = new Thread(runnable);
//        thread.start();
//        for (int i = 0 ; i < 100 ; i++){
//            System.out.println("main thread");
//        }

//        Runnable r = ()->{
//            for (int i = 0 ; i< 10 ; i++){
//                System.out.println("child thread");
//            }
//        };
//        Thread thread = new Thread(r);
//        thread.start();
//        for (int i = 0 ; i < 10 ; i++){
//            System.out.println("Main thread");
//        }

        Thread thread = new Thread(()-> {
            for (int i = 0 ; i< 10 ; i++){
                System.out.println("Child Thread");
            }
        });
        thread.start();
        for (int i = 0 ; i < 10 ; i ++){
            System.out.println("Main");
        }




    }
}
//class MyRunnable implements Runnable{
//    public void run(){
//        for(int i = 0 ; i<100 ; i++ ){
//            System.out.println("child thread");
//        }
//    }
//}
