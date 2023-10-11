package se.iths.Uppgifter.Vecka4.Uppgift1;

public class Baseball extends Ball{
    public Baseball(String brandName) {
        super(brandName);
    }

    @Override
    public void toss() {
        System.out.println("Threw the baseball at a child");
    }

    @Override
    public void bounce() {
        System.out.println("It bounced of his forehead and into traffic");
    }
}
