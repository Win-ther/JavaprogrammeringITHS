package se.iths.Uppgifter.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uppgift1 {
    public static void main(String[] args) {
        String s = "min katt har tre konkatenerade kanter";
        Pattern pattern = Pattern.compile("kat");
        Matcher matcher = pattern.matcher(s);

        System.out.println(matcher.find());
    }
}


/*
1 Skriv ett regex-mönster som testar om ordet strängen "kat"
förekommer i strängen "min katt har tre konkatenerade kanter". Skriv ut svaret på konsolen.
*/
