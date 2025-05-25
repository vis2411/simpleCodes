package comeee;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                for (int i = 0 ; i < 10 ; i++){
                    System.out.println("Child Thread");
                }
            }
        };


//        Runnable runnable = ()->{
//            for (int i = 0 ; i< 10 ; i++){
//                System.out.println("Child Thread");
//            }
//        };
        Thread thread = new Thread(()->{
            for (int i = 0 ; i< 10 ; i++){
                System.out.println("Child Thread");
            }
        });
        thread.run();

        for (int i = 0 ; i< 10 ; i++){
            System.out.println("Main thread");
        }
    }
}
