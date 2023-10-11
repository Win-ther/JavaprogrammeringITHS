package se.iths.Uppgifter.Metoder;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Uppgift9 {
    public static void main(String[] args) {
        daysBetween("1996-05-25","2023-09-07");
    }
    public static void daysBetween(String date1, String date2){
        LocalDate firstDate = LocalDate.parse(date1);
        LocalDate seconDate = LocalDate.parse(date2);

        System.out.println(DAYS.between(firstDate, seconDate));
    }
}
