package se.iths.Uppgifter.Vecka5;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uppgift23456 {
    public static void main(String[] args) {
        /*List<String> slist = new ArrayList<>();
        slist.add("String");
        slist.add("Fff");
        slist.add("Tre");
        List<String> reversed = reverseList(slist);
        System.out.println(reversed);
        System.out.println(slist);*/
        // Set<String> stringSet = toSet("Ett tva tre fyra fem sex sju atta nio tio");
        //  System.out.println(stringSet);
        List<String> stringList = new ArrayList<>();
        stringList.add("Dansar traktorn naken.");
        stringList.add("Goblin hugger draken.");
        stringList.add("Thorn wishes talon.");
        stringList.add("Dansar draken naken.");
        stringList.add("Goblin talon draken.");
        stringList.add("Thorn wishes draken.");
        Map<String, Set<Integer>> map = listToMap(stringList);
        map.forEach((k, v) -> System.out.println(k + " - " + v));
    }

    public static List<String> toList(String string) {
        return List.of(string);
    }

    public static List<String> reverseList(List<String> list) {
        return list.reversed();
    }

    public static Set<String> toSet(String string) {
        Set<String> stringSet = new HashSet<>();
        Pattern p = Pattern.compile("\\w+");
        Matcher m = p.matcher(string);
        while (m.find())
            stringSet.add(m.group());
        return stringSet;

        /*String[] words = string.split(" ");
        return new HashSet<>(List.of(words));*/
    }

    public static String getCapital(String country) {
        Map<String, String> countryMap = new HashMap<>(5);
        countryMap.put("Sverige", "Stockholm");
        countryMap.put("Norge", "Oslo");
        countryMap.put("Finland", "Helsinki");
        countryMap.put("Danmark", "Köpenhamn");
        countryMap.put("Island", "Reykjavik?");
        return countryMap.getOrDefault(country, "Not a valid Country");
    }

    public static Map<String, Set<Integer>> listToMap(List<String> stringList) {
        Map<String, Set<Integer>> stringSetMap = new HashMap<>();
        Pattern p = Pattern.compile("\\w+");
        Matcher m;
        for (int i = 0; i < stringList.size(); i++) {
            m = p.matcher(stringList.get(i));
            while (m.find()) {
                stringSetMap.computeIfAbsent(m.group(), k -> new HashSet<>()).add(i);
            }
        }
        return stringSetMap;

    }
//return IntStream.range(0, stringList.size()).boxed().flatMap(i -> Pattern.compile("\\w+").matcher(stringList.get(i)).results().map(MatchResult::group).distinct().map(word -> new AbstractMap.SimpleEntry<>(word, i))).collect(Collectors.groupingBy(Map.Entry::getKey,Collectors.mapping(Map.Entry::getValue,Collectors.toSet())));


}
