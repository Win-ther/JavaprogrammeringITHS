package se.iths.Uppgifter.Generics.Uppgift1;

import java.util.Arrays;

public class Safe {
    private final int SAFE_SIZE = 10;
    private String[] safe;
    private int stuffInSafe;

    public Safe() {
        safe = new String[SAFE_SIZE];
        stuffInSafe = 0;
    }

    public void store(String stuff) {
        if (stuffInSafe < SAFE_SIZE) {
            safe[stuffInSafe] = stuff;
            stuffInSafe++;
        } else
            System.out.println("No more room to add stuff");
    }

    public String retrieve() {
        if (stuffInSafe != 0) {
            stuffInSafe--;
            String withdrawal = safe[stuffInSafe];

            safe[stuffInSafe] = null;

            return withdrawal;
        } else return null;
    }

    public String retrieve(int index) {
        if (stuffInSafe != 0) {
            stuffInSafe--;
            String withdrawal = safe[index];
            for (int i = index; i < SAFE_SIZE-1; i++) {
                safe[i] = safe[i+1];
            }
            return withdrawal;
        }else return null;
    }

    public int getSAFE_SIZE() {
        return SAFE_SIZE;
    }

    public String[] getSafe() {
        return safe;
    }

    public int getStuffInSafe() {
        return stuffInSafe;
    }

    public static void main(String[] args) {
        Safe safe = new Safe();
        safe.store("Goo");
        safe.store("Pen");
        safe.store("Dog");
        safe.store("Flanders");
        safe.store("The whole nation of Austria");
        safe.store("The color frean");
        safe.store("Luck");
        System.out.println(Arrays.toString(safe.getSafe()));
        System.out.println(safe.getStuffInSafe());
        System.out.println(Arrays.toString(safe.getSafe()));
        System.out.println(safe.retrieve(2));
        System.out.println(safe.retrieve(4));
        System.out.println(Arrays.toString(safe.getSafe()));
    }
}
