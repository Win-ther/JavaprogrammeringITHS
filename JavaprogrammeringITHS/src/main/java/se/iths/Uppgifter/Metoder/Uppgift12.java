package se.iths.Uppgifter.Metoder;

public class Uppgift12 {
    public static void main(String[] args) {
        System.out.println(reverseString("Galenpanna"));
        System.out.println(reverseStringBuilder("Galenpanna"));
    }
    public static String reverseString(String wordswordswords){
        String temp="";
        char te;
        StringBuilder str = new StringBuilder();
        str.append(wordswordswords);
        str.reverse();
        for (int i=0; i<wordswordswords.length(); i++)
        {
            te= wordswordswords.charAt(i);
            temp= te+temp;
        }
        return temp;
    }
    public static String reverseStringBuilder(String wordswordswords){
        StringBuilder str = new StringBuilder();
        str.append(wordswordswords);
        str.reverse();
        return str.toString();
    }

}
