package se.iths.Uppgifter.Metoder;

public class Uppgift10 {
    public static void main(String[] args) {
        System.out.println(ftoC(98.6f));
    }
    public static float ftoC(float F){
        return ((F - 32) * 5) /9;
    }
}
