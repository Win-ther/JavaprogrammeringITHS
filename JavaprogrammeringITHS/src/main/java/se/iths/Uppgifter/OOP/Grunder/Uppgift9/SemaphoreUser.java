package se.iths.Uppgifter.OOP.Grunder.Uppgift9;

public class SemaphoreUser {
    public static void main(String[] args) {
        Semaphore nr1 = Semaphore.requestSemaphore();
        Semaphore nr2 = Semaphore.requestSemaphore();
        Semaphore nr3 = Semaphore.requestSemaphore();
        Semaphore nr4 = Semaphore.requestSemaphore();

        System.out.println(nr1);
        System.out.println(nr2);
        System.out.println(nr3);
        System.out.println(nr4);

        nr1.release();
        nr2.release();
        nr3.release();
        nr4 = Semaphore.requestSemaphore();
        System.out.println(nr4);

    }
}
