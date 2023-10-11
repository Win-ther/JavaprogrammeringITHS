package se.iths.Uppgifter.Vecka2.Uppgift6;

import java.time.LocalDate;

public class Uppgift6 {
    public static void main(String[] args) {
        Employee zach = new Employee("Zach Galifianakis",450000,LocalDate.of(2018,8,16));
        System.out.println(zach.employementTime("2020-08-16"));
        System.out.println(zach.employementTime("FFEELL DDAATTUUMM"));
        System.out.println(zach.employementTime());
        System.out.println(zach.employementTime(LocalDate.of(2030, 5,25)));
    }
}
