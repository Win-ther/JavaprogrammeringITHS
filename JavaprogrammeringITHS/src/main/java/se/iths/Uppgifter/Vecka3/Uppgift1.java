package se.iths.Uppgifter.Vecka3;

public class Uppgift1 {
    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,9,10};
        try {
            onlyEvens(numbers);
        }catch(RuntimeException e){
            System.out.println("Udda");
        }
    }
    public static void onlyEvens(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2 != 0)
                throw new RuntimeException("Udda");
        }
    }
}
