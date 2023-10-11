package se.iths.Uppgifter.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uppgift11 {
    public static void main(String[] args) {
        String s = "hands jumbled terrific old-fashioned grass highfalutin stupendous daughter feigned skirt modern truthful";
        Pattern p = Pattern.compile("[lo]");
        Matcher m = p.matcher(s);
        //Med Stringbuffer - trådsäkert alternativ till Stringbuilder
        /*StringBuffer output = new StringBuffer();
        while (m.find()){
            String replacement = m.group().equals("l") ? "1" : "0";
            m.appendReplacement(output,replacement);
        }
        System.out.println(output);*/
        //Med Stringbuilder- inte trådsäker
        StringBuilder output = new StringBuilder();
        while (m.find()){
            String replacement = m.group().equals("l") ? "1" : "0";
            m.appendReplacement(output,replacement);
        }
        System.out.println(output);


        //Utan Stringbuffer
       /* while (m.find()){
            if (m.group().equals("l")){
                s = s.replace("l", "1");
            }else {
               s = s.replace("o","0");
            }
            System.out.println(m.group());
        }
        System.out.println(s);*/



    }
}
