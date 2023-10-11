package se.iths.Uppgifter.OOP.Grunder.Uppgift9;

public class Semaphore {
    private static int maxNrObjects= 3;

    private Semaphore() {
    }
    public static Semaphore requestSemaphore(){
        if (maxNrObjects >0){
            maxNrObjects--;
            return new Semaphore();
        }else
            return null;
    }

    public void release(){
        maxNrObjects++;
    }


}
