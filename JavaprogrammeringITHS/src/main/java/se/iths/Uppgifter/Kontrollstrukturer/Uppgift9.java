package se.iths.Uppgifter.Kontrollstrukturer;

public class Uppgift9 {
    public static void main(String[] args) {
        int num = 65536;
        while (num > 2){
            System.out.println(num);
            //num /=2;
            num = num >> 1; //Samma som att dela med två, skiftar bitarna ett steg höger
        }
    }
}
