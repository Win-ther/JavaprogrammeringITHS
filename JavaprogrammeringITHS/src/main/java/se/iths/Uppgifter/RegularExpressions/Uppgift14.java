package se.iths.Uppgifter.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uppgift14 {
    public static void main(String[] args) {
        String s = "Detta fick jag. av Bing. ai räddar. mig";
        Pattern p = Pattern.compile("(?<=\\.\\s)\\w");
        Matcher m = p.matcher(s);

        String result = m.replaceAll(match -> match.group().toUpperCase());

        System.out.println(result);
    }
}
