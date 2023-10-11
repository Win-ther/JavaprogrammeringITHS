package se.iths.Uppgifter.Metoder;

public class Uppgift3 {
    public static void main(String[] args) {
        welcomeMyManFromTheCity("Captain Holt","Brooklyn", (byte) 7);
    }
    public static void welcomeMyManFromTheCity(String name, String city, byte favoriteNumber){
        System.out.printf("Väkommen %s från %s med favorittal %d",name,city,favoriteNumber);
    }
}
