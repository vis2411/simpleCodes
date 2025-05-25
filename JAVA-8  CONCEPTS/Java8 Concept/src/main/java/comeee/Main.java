package comeee;

class Main implements in{
    public static void main(String[] args) {
//        System.out.println("hi");
        Main main = new Main();
        main.start();
        main.stop();
        in i = new Ab();
        i.start();
    }

    @Override
    public void start() {
        System.out.println("start");
    }
}
class Ab implements in{

    @Override
    public void start() {
        System.out.println("startfdfd");
    }
}


interface in {
    public void start();
    default public void stop(){
        System.out.println("stop the vehicle");
    }

}