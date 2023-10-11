package se.iths.Uppgifter.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uppgift7 {
    public static void main(String[] args) {
        String s = "hands jumbled terrific old-fashioned grass highfalutin stupendous daughter feigned skirt modern truthful";
        Pattern p = Pattern.compile("\\b[dh]\\w*");
        Matcher m = p.matcher(s);
        int count = 0;
        int count2 = 0;
        while (m.find()){
            System.out.println(m.group());
            count++;
        }
        System.out.println(count);
        System.out.println("________");
        p = Pattern.compile("\\b\\w*s\\b");
        m = p.matcher(s);
        while (m.find()){
            System.out.println(m.group());
            count2++;
        }
        System.out.println(count2);
    }
}
