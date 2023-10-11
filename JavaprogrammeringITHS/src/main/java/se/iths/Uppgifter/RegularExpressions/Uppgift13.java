package se.iths.Uppgifter.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uppgift13 {
    public static void main(String[] args) {
        String s = "hands jumbled terrific old-fashioned grass highfalutin stupendous daughter feigned skirt modern truthful";
        Pattern p = Pattern.compile("\\b\\w[^ae]*\\w\\b");
        Matcher m = p.matcher(s);
        int c = 0;
        while (m.find()){
            System.out.println(m.group());
            c++;
        }
        System.out.println(c);
    }
}
