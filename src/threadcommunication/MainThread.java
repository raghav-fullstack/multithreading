package threadcommunication;

public class MainThread {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();

          synchronized (myThread){
              System.out.println("Main Thread is going to wait.");
            myThread.wait();
            System.out.println("Main Thread is notified.");
            System.out.println("Total Sum is :"+myThread.total);

        }
    }

}
