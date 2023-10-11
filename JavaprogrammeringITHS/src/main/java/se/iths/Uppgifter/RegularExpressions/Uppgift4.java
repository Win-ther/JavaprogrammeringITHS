package se.iths.Uppgifter.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uppgift4 {
    public static void main(String[] args) {
        String s = "min katt har tre konkatenerade kanter";
        Pattern p = Pattern.compile("[^tT]t[^tT]");
        Matcher matcher = p.matcher(s);
        int count = 0;
        while (matcher.find()){
            count++;
            System.out.println("Match #"+count+": "+matcher.group());
        }
    }
}
