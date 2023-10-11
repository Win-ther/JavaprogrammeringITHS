package se.iths.Uppgifter.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uppgift2 {
    public static void main(String[] args) {
        String s = "min katt har tre konkatenerade kanter";
        Pattern pattern = Pattern.compile("(kat|kan|kon)");
        Matcher matcher = pattern.matcher(s);
        int counter = 0;
        while(matcher.find()){
            counter++;
            System.out.println(matcher.group());
        }


        System.out.println(counter);


    }
}

/*
2 Skriv ett pattern som tar reda på hur många gånger orden "kat", "kan" och "kon" förekommer i samma sträng som uppgift1.
Loopa sedan igenom matchningarna och skriv ut varje sökträff på konsolen.
        */