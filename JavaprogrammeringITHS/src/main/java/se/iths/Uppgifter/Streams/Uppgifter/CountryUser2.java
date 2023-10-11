package se.iths.Uppgifter.Streams.Uppgifter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CountryUser2 {
    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("Sverige","Stockholm",10.7,450295));
        countries.add(new Country("Norge","Oslo",5.27,323802));
        countries.add(new Country("Island","Reykjavik",0.33,102775));
        countries.add(new Country("Danmark","Köpenhamn",5.75,42931));
        countries.add(new Country("Finland","Helsinki",5.51,338424));
        countries.add(new Country("Belgien","Bryssel",11.30,30528));
        countries.add(new Country("Tyskland","Berlin",82.18,357168));
        countries.add(new Country("Frankrike","Paris",66.99,640679));
        countries.add(new Country("Storbritannien","London",60.80,209331));
        countries.add(new Country("Niue","Alofi",0.0016,261));
        countries.add(new Country("Mongoliet","Ulan Batar",3.08,1566000));
        countries.add(new Country("Polen","Warszawa",38.63,312679));
        countries.add(new Country("Spanien","Madrid",46.5,505990));
        countries.add(new Country("Portugal","Lissabon",10.31,92212));
        countries.add(new Country("Italien","Rom",60.59,301338));
        countries.add(new Country("Grekland","Aten",11.18,131957));
        countries.add(new Country("Luxemburg","Luxemburg",0.58,2586));
        countries.add(new Country("Liechtenstein","Vaduz",0.038,160));

        //printFirstLast(countries);
        //printSortedByName(countries);
        //printSortedByPop(countries);
        //printMaxPop(countries);
        //printAveragePopAndCountriesBelowIt(countries);
        //countriesBelow5MPop(countries);
        //threeQueriesForPopOverX(countries);
        //capitalThatStartsWithSameLetter(countries);
        //countyNamesLongerThanCapitalNames(countries);
        //fiveSmallestPop(countries);
        //fiveSmallestPopOver7M(countries);
        //fiveOver500KLimitToThree(countries);
        //countryByStartLetter(countries);
        //countriesByPop(countries);
        //popToInt(countries);
        //popByArea(countries);
        //sortedByCapitalBackwards(countries);
        //sixSmallestPopThreeBiggestPop(countries);
        //System.out.println(countries.stream().filter(c -> c.getCountry().length() == 7).mapToDouble(Country::getPopInMillion).sum());
    }

    private static void sixSmallestPopThreeBiggestPop(List<Country> countries) {
        System.out.println(countries.stream().sorted(Comparator.comparingDouble(Country::getPopInMillion)).mapToDouble(Country::getPopInMillion).limit(6).sum());
        System.out.println(countries.stream().sorted(Comparator.comparingDouble(Country::getPopInMillion).reversed()).mapToDouble(Country::getPopInMillion).limit(3).sum());
    }

    private static void sortedByCapitalBackwards(List<Country> countries) {
        countries.stream().map(c -> new StringBuilder(c.getCapitalCity()).reverse().append(" - ").append(c.getCountry())).sorted().forEach(System.out::println);
    }

    private static void popByArea(List<Country> countries) {
        countries.stream().map(c -> c.getCountry() +" - "+(float)(c.getPopInMillion()*1000000)/c.getAreaInSquareKm() + " pop/km^2").forEach(System.out::println);
    }

    private static void popToInt(List<Country> countries) {
        countries.stream().map(c -> c.getCountry() + " - " + (int)(c.getPopInMillion()*1000000)).forEach(System.out::println);
    }

    private static void countriesByPop(List<Country> countries) {
        var map = countries.stream().collect(Collectors.groupingBy(c -> (int)c.getPopInMillion()));
        map.entrySet().forEach(System.out::println);
    }

    private static void countryByStartLetter(List<Country> countries) {
        var map = countries.stream().collect(Collectors.groupingBy(c -> c.getCountry().substring(0,1), Collectors.counting()));
        map.entrySet().forEach(System.out::println);
    }

    private static void fiveOver500KLimitToThree(List<Country> countries) {
        countries.stream().filter(c -> c.getAreaInSquareKm() > 500000).limit(3).sorted(Comparator.comparing(Country::getCountry)).forEach(System.out::println);
    }

    private static void fiveSmallestPopOver7M(List<Country> countries) {
        countries.stream().filter(c -> c.getPopInMillion() > 7.0).sorted(Comparator.comparingDouble(Country::getPopInMillion)).limit(5).forEach(System.out::println);
    }

    private static void fiveSmallestPop(List<Country> countries) {
        countries.stream().sorted(Comparator.comparingDouble(Country::getPopInMillion)).limit(5).forEach(System.out::println);
    }

    private static void countyNamesLongerThanCapitalNames(List<Country> countries) {
        countries.stream().filter(c -> c.getCountry().length() > c.getCapitalCity().length()).forEach(System.out::println);
    }

    private static void capitalThatStartsWithSameLetter(List<Country> countries) {
        countries.stream().filter(country -> country.getCapitalCity().startsWith(country.getCountry().substring(0,1))).forEach(System.out::println);
    }

    private static void threeQueriesForPopOverX(List<Country> countries) {
        System.out.println("\nOver 10000");
        countries.stream().filter(c -> c.getPopInMillion() > 0.01).forEach(System.out::println);
        System.out.println("\nOver 100000");
        countries.stream().filter(c -> c.getPopInMillion() > 0.1).forEach(System.out::println);
        System.out.println("\nOver 1000000");
        countries.stream().filter(c -> c.getPopInMillion() > 1).forEach(System.out::println);
    }

    private static void countriesBelow5MPop(List<Country> countries) {
        countries.stream().filter(c -> c.getPopInMillion() < 5.0).forEach(System.out::println);
    }

    private static void printAveragePopAndCountriesBelowIt(List<Country> countries) {
        double averageArea = countries.stream().mapToDouble(Country::getAreaInSquareKm).sum() / countries.size();
        System.out.println(averageArea);
        countries.stream().filter(c -> c.getAreaInSquareKm() < averageArea).forEach(System.out::println);
    }

    private static void printMaxPop(List<Country> countries) {
        System.out.println(countries.stream().max(Comparator.comparing(Country::getPopInMillion)));
    }

    private static void printSortedByPop(List<Country> countries) {
        countries.stream().sorted(Comparator.comparing(Country::getPopInMillion, Comparator.reverseOrder())).forEach(System.out::println);
    }

    private static void printSortedByName(List<Country> countries) {
        countries.stream().sorted(Comparator.comparing(Country::getCountry)).forEach(System.out::println);
    }

    private static void printFirstLast(List<Country> countries) {
        System.out.println(countries.getFirst());
        System.out.println(countries.getLast());
    }
}
