package se.iths.Uppgifter.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uppgift5 {
    public static void main(String[] args) {
        String s = "hands jumbled terrific old-fashioned grass highfalutin stupendous daughter feigned skirt modern truthful";
        Pattern p = Pattern.compile("as|od");
        Matcher m = p.matcher(s);
        int count = 0;
        while (m.find()){
            System.out.println(m.group());
            count++;
        }
        System.out.println(count);
    }
}
