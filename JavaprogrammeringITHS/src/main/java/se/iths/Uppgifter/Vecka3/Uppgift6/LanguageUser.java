package se.iths.Uppgifter.Vecka3.Uppgift6;

import java.util.Locale;

public class LanguageUser {
    public static void main(String[] args) {
        Swedish swe = new Swedish();
        Locale.setDefault(swe.getLocale());
        System.out.println(swe.cancel());
        System.out.println(swe.greeting());
        System.out.println(swe.ok());
        System.out.println(swe.tryAgain());
        System.out.println(swe.getLocale());

        USEnglish us = new USEnglish();
        Locale.setDefault(us.getLocale());
        System.out.println(us.cancel());
        System.out.println(us.greeting());
        System.out.println(us.ok());
        System.out.println(us.tryAgain());
        System.out.println(us.getLocale());


    }
}
