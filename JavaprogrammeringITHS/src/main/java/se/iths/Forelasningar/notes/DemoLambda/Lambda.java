package se.iths.Forelasningar.notes.DemoLambda;

public class Lambda {
    public static void main(String[] args) {
        Present present = new Present() {
            @Override
            public void display() {
                System.out.println("Anonymklass");
                System.out.println(getClass().getName());
            }
        };
        present.display();

        Present present2 = () -> System.out.println("Anonymklass med lambda");
        present2.display();

        Calculator add = Integer::sum;
        Calculator sub = (a,b) -> a-b;

        printCalc(5,5,add);
        printCalc(5,3,sub);
        printCalc(5,3,(a,b)->a*b);



    }
    public static void printCalc(int n1, int n2, Calculator calculator){
        System.out.println(calculator.calculate(n1, n2));
    }
}
