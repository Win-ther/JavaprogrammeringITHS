package se.iths.Uppgifter.Metoder;

public class Uppgift6 {
    public static void main(String[] args) {
        System.out.println(daysInMonth(Month.FEBRUARI));

    }

    enum Month {
        JANUARI, FEBRUARI, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OKTOBER, NOVEMBER, DECEMBER
    }

    public static int daysInMonth(Month month) {
        switch (month) {
            case JANUARI, MARCH, MAY, JULY, AUGUST, OKTOBER, DECEMBER -> {
                return 31;
            }
            case FEBRUARI -> {
                return 28;
            }
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> {
                return 30;
            }
            default -> {
                return 0;
            }
        }
    }
}
