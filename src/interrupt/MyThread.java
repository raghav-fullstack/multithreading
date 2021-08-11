package interrupt;

public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=1; i<=10; i++){
            System.out.println("I am a lazy thread.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Got Interrupted.");
            }
        }
    }
}
