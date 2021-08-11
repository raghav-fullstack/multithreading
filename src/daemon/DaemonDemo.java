package daemon;

public class DaemonDemo {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().isDaemon());

        MyThread myThread = new MyThread();


        System.out.println(myThread.currentThread());
        System.out.println(myThread.currentThread().isDaemon());

        myThread.start();
        myThread.setDaemon(true);


    }
}
