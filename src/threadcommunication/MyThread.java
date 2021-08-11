package threadcommunication;

public class MyThread extends Thread {
    int total=100;

    @Override
    public void run() {
        System.out.println("Child Thread us calculating the sum.");

        synchronized (this) {
            for (int i = 1; i <= 120; i++) {
                total += i;

            }
            this.notify();
        }
    }
}
