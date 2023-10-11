package se.iths.Uppgifter.Vecka4.Uppgift1;

public class Football extends Ball{
    public Football(String brandName) {
        super(brandName);
    }

    @Override
    public void toss() {
        System.out.println("Tossed the football away from the game, everyone is mad at you.");
    }

    @Override
    public void bounce() {
        System.out.println("Its a football, stop bouncing it.");
    }
}
