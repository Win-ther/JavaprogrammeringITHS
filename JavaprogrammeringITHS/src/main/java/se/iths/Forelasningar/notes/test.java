package se.iths.Forelasningar.notes;

import java.awt.*;

public class test {
    public static void main(String[] args) {
       // printMulTable(9);
        //System.out.printf("%.2f",taxAmount(153001));
        //float f = Float.MIN_VALUE;
        //System.out.println(f);
        System.out.println(Color.BLACK);
    }
    public static void printMulTable(int mul){
        for (int i = 1; i < 11; i++) {
            System.out.println(mul*i);
        }
    }
    public static Double taxAmount(int salary){
        return salary*0.3 + Math.max(salary-100000,0)*0.1;
        //If-less programming.^
        //return salary <= 100000 ? salary*0.3 : 30000 + (salary-100000)*0.4;
        //Samma som ovan ^ // ? = if-satsen
        /*if (salary <= 100000)
            return salary*0.3;
        return 100000*0.3 + (salary-100000)*0.4;*/
    }

}
