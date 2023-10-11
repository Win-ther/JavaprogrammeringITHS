package se.iths.Uppgifter.Metoder;

public class Uppgift4 {
    public static void main(String[] args) {
        try {
            System.out.println(godDamnItsAStringAgain("d"));
        } catch (NumberFormatException e) {
            System.out.println("That was not a number");
        }
    }

    public static int godDamnItsAStringAgain(String ssssnake) {
        return Integer.parseInt(ssssnake);
    }
}
