package se.iths.Uppgifter.Vecka2.Uppgift4;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static Scanner scanner = new Scanner(System.in);

    public static String inputString() {
        return scanner.nextLine();
    }

    public static String inputString(String[] okInput) {
        String in;
        while (true) {
            System.out.println("Tillgängliga val: " + Arrays.toString(okInput));
            in = scanner.nextLine();
            for (String s : okInput) {
                if (in.equalsIgnoreCase(s)) {
                    return in;
                } else if (in.equalsIgnoreCase("firetruck")) {
                    System.out.println("""
                            Water. Earth. Fire. Air. Long ago, the four trucks lived together in harmony.
                            Then, everything changed when the firetrucks attacked.
                            Only the Avatar, master of all four trucks, could stop them, but when the world needed him most, he trucked along and vanished.
                            A hundred years passed and my brother and I discovered the new Avatar, an airtrucker named Greg.
                            And although his airtrucking skills are great, he has a lot to learn before he's ready to save anyone.
                            But I believe Greg can save the world.
                            """);
                    break;
                }
            }
            System.out.println("Ogiltig input, försök igen");
        }
    }

    public static int inputInt() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Not an Integer, try again");
            return inputInt();
        }
    }

    public static double inputDouble() {
        try {
            return Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Not a Double, try again");
            return inputDouble();
        }
    }

    public static float inputFloat() {
        try {
            return Float.parseFloat(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Not a Float, try again");
            return inputFloat();
        }
    }

    public static boolean inputBool() {
        switch (scanner.nextLine().toLowerCase()) {
            case "j", "y", "yes", "ja" -> {
                return true;
            }
            case "n", "no", "nej" -> {
                return false;
            }
            default -> {
                System.out.println("Ogiltig inmatning, testa igen");
                return inputBool();
            }
        }
    }
}
