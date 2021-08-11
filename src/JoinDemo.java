import java.util.Scanner;

public class JoinDemo extends Thread {

    static int n,sum=0;

    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();
        System.out.println("Sum of first 'N' numbers");
        System.out.println("Enter a value");

        Scanner scanner = new Scanner(System.in);
        JoinDemo.n = scanner.nextInt();

        JoinDemo jd = new JoinDemo();
        jd.start();
        jd.join();

        System.out.println("Sum of first"+JoinDemo.n+ "Numbers is : " +JoinDemo.sum);

        long end = System.currentTimeMillis();

        System.out.println("Total Time Taken : "+(end-start)/1000 + " seconds.");
    }

    public void run(){
        for(int i=1;i<=JoinDemo.n;i++){
            JoinDemo.sum+=i;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {


            }
        }
    }
}
