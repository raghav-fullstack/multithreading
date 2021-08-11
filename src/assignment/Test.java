package assignment;

public class Test {
    public static void main(String[] args) {
        EvenNumber evenNumber = new EvenNumber();
        OddNumber oddNumber = new OddNumber();

        Thread t1 = new Thread(evenNumber);
        Thread t2 = new Thread(oddNumber);

        t1.start();
        t2.start();

        for( int i=0; i<=10; i++){
            System.out.println(i);
        }

    }
}
