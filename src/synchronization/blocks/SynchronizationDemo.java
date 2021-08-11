package synchronization.blocks;

public class SynchronizationDemo {
    public static void main(String[] args) {

    DisplayMessage dm = new DisplayMessage();

    MyThread t1 = new MyThread( "Raghav");
    MyThread t2 = new MyThread("Aarav");

    t1.start();
    t2.start();

    }



}
