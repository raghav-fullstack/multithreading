package threadgroups;

public class ThreadGroupMethods {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup myThreadGroup = new ThreadGroup("MyThreadGroup");

        CustomThread thread1 = new CustomThread(myThreadGroup, "Thread 1");
        CustomThread thread2 = new CustomThread(myThreadGroup, "Thread 2");
        CustomThread thread3 = new CustomThread(myThreadGroup, "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println(myThreadGroup.activeCount());
        System.out.println(myThreadGroup.activeGroupCount());

        myThreadGroup.list();

        Thread.sleep(5000);

        System.out.println(myThreadGroup.activeCount());

        myThreadGroup.list();

    }

}
