package se.iths.Uppgifter.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uppgift10 {
    public static void main(String[] args) {
        String s = "sss ooo ppp dd f s o p";
        Pattern p = Pattern.compile("(\\w)\\1\\1");
        Matcher m = p.matcher(s);
        int c = 0;
        while (m.find()){
            System.out.println(m.group());
            c++;
        }
        System.out.println(c);
    }
}
