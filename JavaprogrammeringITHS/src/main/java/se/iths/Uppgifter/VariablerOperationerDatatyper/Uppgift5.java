package se.iths.Uppgifter.VariablerOperationerDatatyper;

import java.util.Scanner;

public class Uppgift5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hur mycket pengar har du på kontot(Skriv i siffror, decimalform tillåten)?");
        double saldo = in.nextInt();
        System.out.println("Vilken räntesats är det?(Skriv den i decimal-form)");
        double interest = in.nextDouble();
        System.out.println("Hur många år har du haft pengarna på kontot?");
        double years = in.nextDouble();
        System.out.println("Du har efter "+years+"år: "+returnTotal(saldo,interest,years)+"kr på kontot");
    }
    //Inte hur ränta fungerar men är löst enligt uppgiften:P
    public static double returnTotal(double saldo, double interest, double years){
        double total = saldo+(saldo*(interest*years));
        return total;
    }
}
