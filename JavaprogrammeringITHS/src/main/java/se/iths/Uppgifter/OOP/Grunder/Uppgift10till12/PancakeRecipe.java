package se.iths.Uppgifter.OOP.Grunder.Uppgift10till12;

public class PancakeRecipe {
    int flour = 9;
    int milk = 8;
    int egg = 12;
    int salt = 3000;
    int butter = 7;
    int pancakeCounter = 0;

    public boolean canMakePancakes(){
        return flour > 0 && milk > 0 && egg > 0 && salt > 0 && butter >0;
    }
    public void makePancakes(){
        if(canMakePancakes()){
            flour--;
            milk--;
            egg--;
            salt--;
            butter--;
            pancakeCounter++;
            makePancakes();
        }else {
            System.out.println("Kan inte göra fler pannkakor, det blev "+pancakeCounter+" st, köp mer ingredienser för att göra fler");
        }
    }

    public static void main(String[] args) {
        PancakeRecipe p = new PancakeRecipe();
        System.out.println(p.canMakePancakes());
        p.makePancakes();
    }
}
