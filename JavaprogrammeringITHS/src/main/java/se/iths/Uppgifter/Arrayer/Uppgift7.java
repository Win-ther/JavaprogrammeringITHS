package se.iths.Uppgifter.Arrayer;

public class Uppgift7 {
    public static void main(String[] args) {
        printA();
        printB();
        printC();
        printD();
        printE();
        printF();
        printG();
        printH();
        printI();
        printJ();
        printK();
    }
    public static void printA(){
        System.out.println("   A   ");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 8; col++) {
                if (row == col)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }
    public static void printB(){
        System.out.println("   B   ");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 8; col++) {
                if (row == col || col == row+4)
                    System.out.print("#");
                else
                    System.out.print("-");

            }
            System.out.println("");
        }
    }
    public static void printC(){
        System.out.println("   C   ");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 8; col++) {
                if (row == col || col == row+1)
                    System.out.print("#");
                else
                    System.out.print("-");

            }
            System.out.println("");
        }
    }
    public static void printD(){
        System.out.println("   D   ");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 8; col++) {
                if (col == 2 || col == 5 || row == 2)
                    System.out.print("#");
                else
                    System.out.print("-");

            }
            System.out.println("");
        }
    }
    public static void printE(){
        int x = 4;
        System.out.println("   E   ");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 8; col++) {
                if (col == row || col == x)
                    System.out.print("#");
                else
                    System.out.print("-");

            }
            x--;
            System.out.println("");
        }
    }
    public static void printF(){
        System.out.println("   F   ");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (col == row || col == row-2 ||col == row+2)
                    System.out.print("#");
                else
                    System.out.print("-");

            }
            System.out.println("");
        }
    }
    public static void printG(){
        System.out.println("   G   ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 6; col++) {
                if (col < 3)
                    System.out.print("#");
                else
                    System.out.print("-");

            }
            System.out.println("");
        }
        System.out.println("------");
    }
    public static void printH(){
        System.out.println("   H   ");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 7; col++) {
                if (row+2 == col ||col >4 && row <2)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }
    public static void printI(){
        System.out.println("   I   ");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                if (col == 2 && row !=2)
                    System.out.print("#");
                else
                    System.out.print("-");
            }
            System.out.println("");
        }
    }
    public static void printJ(){
        int x = 4;
        System.out.println("   J   ");
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (col == row && row !=2 || col == x && row !=2)
                    System.out.print("#");
                else if(col ==2 && row == 2)
                    System.out.print("o");
                else
                    System.out.print("-");
            }
            x--;
            System.out.println("");
        }
    }
    public static void printK(){
        int x = 0;
        int y = 1;
        System.out.println("   K   ");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 8; col++) {
                if (col%2 != 0&& row < 2)
                    System.out.print("--");
                else if(row == 2 && col < 3){
                    System.out.print("WW");
                } else if (row == 2) {
                    System.out.print("~~");
                } else
                    System.out.print("##");
            }
            x+=4;
            y+=4;
            System.out.println("");
        }
    }
}
