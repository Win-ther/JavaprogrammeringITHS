package se.iths.Uppgifter.Arrayer;

public class Uppgift10 {
    public static void main(String[] args) {
        String[][] arr2D = new String[][]{{"#","-","-","-","#","-","-","-"},{"-","#","-","-","-","#","-","-"},{"-","-","#","-","-","-","#","-"},{"-","-","-","#","-","-","-","#"}};
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j]);
            }
            System.out.println("");
        }
    }
}
