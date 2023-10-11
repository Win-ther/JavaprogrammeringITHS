package se.iths.Uppgifter.Streams.Uppgifter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CountryUser {
    public static void main(String[] args) {
        //Uppgift 1
        ArrayList<Country> c = new ArrayList<>();
        c.add(new Country("Sverige","Stockholm",10.7,450295));
        c.add(new Country("Norge","Oslo",5.27,323802));
        c.add(new Country("Island","Reykjavik",0.33,102775));
        c.add(new Country("Danmark","Köpenhamn",5.75,42931));
        c.add(new Country("Finland","Helsinki",5.51,338424));
        c.add(new Country("Belgien","Bryssel",11.30,30528));
        c.add(new Country("Tyskland","Berlin",82.18,357168));
        c.add(new Country("Frankrike","Paris",66.99,640679));
        c.add(new Country("Storbritannien","London",60.80,209331));
        c.add(new Country("Niue","Alofi",0.0016,261));
        c.add(new Country("Mongoliet","Ulan Batar",3.08,1566000));
        c.add(new Country("Polen","Warszawa",38.63,312679));
        c.add(new Country("Spanien","Madrid",46.5,505990));
        c.add(new Country("Portugal","Lissabon",10.31,92212));
        c.add(new Country("Italien","Rom",60.59,301338));
        c.add(new Country("Grekland","Aten",11.18,131957));
        c.add(new Country("Luxemburg","Luxemburg",0.58,2586));
        c.add(new Country("Liechtenstein","Vaduz",0.038,160));
        //Uppgift 2
        System.out.println("_______________FIRST AND LAST IN LIST___________________\n");
        Country one = c.stream().findFirst().get();
        Country last = c.stream().reduce((first, second) -> second).get();
        System.out.println(one.getCountry());
        System.out.println(last.getCountry());
        System.out.println("\n_______________UNSORTED___________________\n");
        //Uppgift 3
        List<Country> sortedC = c.stream().sorted(Comparator.comparing(Country::getCountry)).toList();
        c.forEach(System.out::println);
        System.out.println("\n________________SORTED BY COUNTRY NAME__________________\n");
        sortedC.forEach(System.out::println);
        //Uppgift4
        sortedC =  c.stream().sorted(Comparator.comparing(Country::getPopInMillion,Comparator.reverseOrder())).toList();
        System.out.println("\n________________SORTED BY LARGEST POP__________________\n");
        sortedC.forEach(System.out::println);
        //Uppgift5
        System.out.println("\n________________POP OF "+c.stream().max(Comparator.comparing(Country::getPopInMillion)).get().getCountry().toUpperCase()+"__________________");
        System.out.println(c.stream().max(Comparator.comparing(Country::getPopInMillion)).get().getPopInMillion()+" million");
        //Uppgift6
        System.out.println("\n________________AVERAGE AREA AND COUNTRIES BELOW IT__________________\n");
        int medel = c.stream().mapToInt(Country::getAreaInSquareKm).sum() /c.size();
        System.out.println("Average area "+medel+"km^2");
        c.stream().filter(n -> n.getAreaInSquareKm() < medel).forEach(System.out::println);
        //Uppgift7
        System.out.println("\n________________COUNTRIES BELOW 5M POP__________________\n");
        c.stream().filter(n -> n.getPopInMillion() < 5.0).forEach(System.out::println);
        //Uppgift8
        System.out.println("\n________________COUNTRIES WITH AREA OVER 10000__________________\n");
        c.stream().filter(n -> n.getAreaInSquareKm() > 10000).forEach(System.out::println);
        System.out.println("\n________________COUNTRIES WITH AREA OVER 100000__________________\n");
        c.stream().filter(n -> n.getAreaInSquareKm() > 100000).forEach(System.out::println);
        System.out.println("\n________________COUNTRIES WITH AREA OVER 1000000__________________\n");
        c.stream().filter(n -> n.getAreaInSquareKm() > 1000000).forEach(System.out::println);
        //Uppgift9
        System.out.println("\n________________COUNTRIES WITH SAME FIRST LETTER IN COUNTRY AND CAPITAL__________________\n");
        c.stream().filter(n -> n.getCountry().substring(0,1).equals(n.getCapitalCity().substring(0,1))).forEach(System.out::println);
        //Uppgift10
        System.out.println("\n________________COUNTRIES WITH NAME LONGER THAN NAME OF CAPITAL__________________\n");
        c.stream().filter(n -> n.getCountry().length() > n.getCapitalCity().length()).forEach(System.out::println);
        //Uppgift11
        System.out.println("\n________________FIRST FIVE COUNTRIES WITH LOWEST POP__________________\n");
        sortedC = c.stream().sorted(Comparator.comparing(Country::getPopInMillion)).toList();
        sortedC.stream().limit(5).forEach(System.out::println);
        //Uppgift12
        System.out.println("\n________________FIRST THREE COUNTRIES WITH LOWEST POP OVER 7MILLION__________________\n");
        sortedC.stream().filter(n -> n.getPopInMillion() > 7.0).limit(3).forEach(System.out::println);
        //Uppgift13
        System.out.println("\n________________UP TO THREE COUNTRIES WITH AREA OF AT LEAST 500000KM^2, SORTED BY COUNTRY NAME__________________\n");
        sortedC = c.stream().sorted(Comparator.comparing(Country::getCountry)).toList();
        sortedC.stream().filter(n -> n.getAreaInSquareKm() >= 500000).limit(3).forEach(System.out::println);
        //Uppgift14
        System.out.println("\n________________HOW MANY COUNTRIES THAT STARTS ON THE SAME LETTER__________________\n");
        for (char ch = 'A' ; ch < 'Z'; ch++) {
            char tempCh = ch;
            sortedC = c.stream().filter(n -> n.getCountry().charAt(0) == tempCh).toList();
            if (!sortedC.isEmpty())
                System.out.println(ch +"="+ sortedC.size());
        }
        //Uppgift15
        System.out.println("\n________________COUNTRIES WITH XM POP__________________\n");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c.size(); i++) {
            int popToInt =(int) c.stream().sorted(Comparator.comparing(Country::getPopInMillion)).toList().get(i).getPopInMillion();
            String strang = "\nLänder med "+popToInt+" miljoner invånare: \n";
            sortedC = c.stream().filter(n -> (int)n.getPopInMillion() == popToInt).toList();
            if (!sb.toString().contains(strang)){
                sb.append(strang).append(sortedC.stream().map(Country::getCountry).sorted().toList()).append("\n");
            }
        }
        System.out.println(sb);
        //Uppgift16a
        System.out.println("\n________________NAME AND POP IN FULL INTEGER__________________\n");
        c.stream().map(Country -> Country.getCountry() + " " + (int)(Country.getPopInMillion()*1000000)).forEach(System.out::println);
        //Uppgift16b
        System.out.println("\n________________NAME AND POP PER KM^2__________________\n");
        c.stream().map(Country -> Country.getCountry() + " "+Math.round(Country.getPopInMillion()*1000000)/Country.getAreaInSquareKm()+" invånare per km^2").forEach(System.out::println);
        //Uppgift17
        System.out.println("\n________________CAPITAL BACKWARDS__________________\n");
        c.stream().map(Country -> new StringBuilder(Country.getCapitalCity()).reverse().append(" ").append(Country.getCountry())).sorted().forEach(System.out::println);
        //Uppgift18
        System.out.println("\n________________POP OF 6 SMALLEST COUNTRIES AND POP OF 3 BIGGEST COUNTRIES__________________\n");
        sortedC = c.stream().sorted(Comparator.comparing(Country::getPopInMillion)).limit(6).toList();
        double popOfSixSmallest = sortedC.stream().mapToDouble(Country::getPopInMillion).sum();
        System.out.println(sortedC.stream().map(Country::getCountry).toList() + "\nHar tillsammans: " + popOfSixSmallest + " Millioner invånaren\n");
        sortedC = c.stream().sorted(Comparator.comparing(Country::getPopInMillion,Comparator.reverseOrder())).limit(3).toList();
        double popOf3Biggest = sortedC.stream().mapToDouble(Country::getPopInMillion).sum();
        System.out.println(sortedC.stream().map(Country::getCountry).toList() + "\nHar tillsammans: "+popOf3Biggest+ " Millioner invånare");
        //Uppgift19
        System.out.println("\n________________POP OF ALL COUNTRIES WITH 7 LETTERS IN NAME__________________\n");
        sortedC = c.stream().filter(n -> n.getCountry().length() == 7).toList();
        double popOfSevenLetterCountries = sortedC.stream().mapToDouble(Country::getPopInMillion).sum();
        System.out.println(sortedC.stream().map(Country::getCountry).toList() + "\nHar tillsammans: "+popOfSevenLetterCountries+ " Millioner invånare");
    }
}
