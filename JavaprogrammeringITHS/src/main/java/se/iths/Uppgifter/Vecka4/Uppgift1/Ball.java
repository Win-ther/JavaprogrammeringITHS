package se.iths.Uppgifter.Vecka4.Uppgift1;

public abstract class Ball implements Tossable {
    private final String brandName;

    public Ball(String brandName) {
        this.brandName = brandName;
    }

    public abstract void bounce();

    public String getBrandName() {
        return brandName;
    }
}
