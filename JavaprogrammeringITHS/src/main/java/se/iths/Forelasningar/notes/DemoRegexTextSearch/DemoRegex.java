package se.iths.Forelasningar.notes.DemoRegexTextSearch;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegex {
    public static void main(String[] args) {
        //greygray();
        //zzz();
        //digitMatch();
        //zMatch();
        //elevenDigitMatch();
        //dogFirst();
        //dogLast();
        //onlyDog();
        Pattern p = Pattern.compile("\\d{4}(-\\d{4}){3}");
        Matcher m = p.matcher("222211411-6222-3533-4454555555");
        m.results().map(MatchResult::group).forEach(System.out::println);
    }

    private static void onlyDog() {
        Pattern p = Pattern.compile("^dog$");
        Matcher m = p.matcher("dog");
        m.results().map(MatchResult::group).forEach(System.out::println);
    }

    private static void dogLast() {
        Pattern p = Pattern.compile("dog$");
        Matcher m = p.matcher("dog cat dogdogcatdog");
        m.results().map(MatchResult::group).forEach(System.out::println);
    }

    private static void dogFirst() {
        Pattern p = Pattern.compile("^dog");
        Matcher m = p.matcher("dog cat dogdogcat");
        m.results().map(MatchResult::group).forEach(System.out::println);
    }

    private static void elevenDigitMatch() {
        Pattern p = Pattern.compile("1\\d{10}\\b");
        Matcher m = p.matcher("dsadf 12345612345 ddddrft");
        m.results().map(MatchResult::group).forEach(System.out::println);
    }

    private static void zMatch() {
        Pattern p = Pattern.compile("z{3,}");
        Matcher m = p.matcher("z, zz, zzz, zzzzzz, zzzzzzzzz, fff ,bbbbtzztt,fffzz");
        m.results().map(MatchResult::group).forEach(System.out::println);
    }

    private static void digitMatch() {
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("1a2b4f5h7h560p34");

        while (m.find())
            System.out.println(m.group());
    }

    private static void zzz() {
        Pattern p = Pattern.compile("\\bzzz\\b");
        Matcher m = p.matcher("<x zzz zzzxzzz zx zzx");

        while (m.find())
            System.out.println(m.group());
    }

    private static void greygray() {
        Pattern p = Pattern.compile("gr[ea]y");
        Matcher m = p.matcher("grey gray groy");

        while (m.find())
            System.out.println(m.group());
    }
}
