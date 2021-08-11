package synchronization.deadlocks;

public class FirstResource {

    public synchronized void method1(SecondResource sr){
        System.out.println("Inside method1 for First Resource.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Invoking method2 of second resource.");
        sr.method2();
    }

    public synchronized void method2(){

        System.out.println("Inside method2 for First Resource.");

    }
}
