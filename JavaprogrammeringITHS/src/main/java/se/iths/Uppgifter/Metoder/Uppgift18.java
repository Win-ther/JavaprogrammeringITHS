package se.iths.Uppgifter.Metoder;

public class Uppgift18 {
    public static void main(String[] args) {
        System.out.println(reverseStringRecursive("Eldtruck"));
    }
    public static String reverseStringRecursive(String string){
        if (string.length() <= 1) {
            return string;
        }
        else {
            char firstChar = string.charAt(0);
            String restOfString = string.substring(1);
            String reversedRest = reverseStringRecursive(restOfString);
            return reversedRest + firstChar;
        }
    }
}
