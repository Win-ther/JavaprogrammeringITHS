package se.iths.Uppgifter.Vecka3.Uppgift6;

import java.util.Locale;

public class Swedish extends Language{
    @Override
    public Locale getLocale() {
        return Locale.of("se-SV");
    }

    @Override
    public String greeting() {
        return "Hej!";
    }

    @Override
    public String ok() {
        return "Okej";
    }

    @Override
    public String cancel() {
        return "Avbryt";
    }

    @Override
    public String tryAgain() {
        return "Försök igen";
    }
}
