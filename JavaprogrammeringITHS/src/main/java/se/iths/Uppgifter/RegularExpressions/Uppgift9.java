package se.iths.Uppgifter.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uppgift9 {
    public static void main(String[] args) {
        String s = "ss oo pp";
        Pattern p = Pattern.compile("(\\w)\\1");
        Matcher m = p.matcher(s);
        int c = 0;
        while (m.find()){
            System.out.println(m.group());
            c++;
        }
        System.out.println(c);
    }
}
