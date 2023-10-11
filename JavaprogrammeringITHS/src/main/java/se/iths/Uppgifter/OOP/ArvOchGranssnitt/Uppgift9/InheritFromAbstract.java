package se.iths.Uppgifter.OOP.ArvOchGranssnitt.Uppgift9;

public class InheritFromAbstract extends Abstract{
    @Override
    public void printFeetPics() {
        System.out.println("No. x_X");
    }

    public InheritFromAbstract() {
    }

    public static void main(String[] args) {
        InheritFromAbstract d = new InheritFromAbstract();
        d.printFeetPics();
    }
}
