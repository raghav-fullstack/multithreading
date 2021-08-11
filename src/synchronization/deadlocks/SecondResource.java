package synchronization.deadlocks;

public class SecondResource {

    public synchronized void method1(FirstResource fr){
        System.out.println("Inside method1 for Second Resource.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Invoking method2 of second resource.");
        fr.method2();
    }

    public synchronized void method2(){

        System.out.println("Inside method2 for Second Resource.");

    }
}
