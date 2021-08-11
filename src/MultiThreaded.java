public class MultiThreaded extends Thread{

    public static void main(String[] args) {

        MultiThreaded mt1 = new MultiThreaded();
        mt1.setPriority(NORM_PRIORITY);
        mt1.setName("MT 1");
        mt1.start();

        MultiThreaded mt2 = new MultiThreaded();
        mt2.setPriority(MIN_PRIORITY);
        mt2.setName("MT 2");
        mt2.start();

        Thread currentThread = Thread.currentThread();
        System.out.println("Thread Name is "+currentThread.getName());

      /* for (int j=1;j<= 200;j++){
            System.out.print("j :" + j + "\t");
            Thread.sleep(100);
        }*/

    }

    public void run(){
        Thread currentThread = Thread.currentThread();
        currentThread.setName("Print 20 Numbers.");
        System.out.println("Thread Name is :"+ currentThread.getName());

        for (int i=1;i<= 20;i++){
            System.out.print("i :" + i+ "\t");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("Child Thread Exiting.");
            }
        }
    }
}
