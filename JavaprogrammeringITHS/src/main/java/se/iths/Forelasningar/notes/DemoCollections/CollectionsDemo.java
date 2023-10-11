package se.iths.Forelasningar.notes.DemoCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsDemo {
    public static void main(String[] args) {

        List<Phone> phones = new ArrayList<>();
        List<Phone> immutablePhones = List.of();

        phones.add(new Phone(2,"Iphone", 12));
        phones.add(new Phone(5,"Sony", 7));
        phones.add(new Phone(8,"OnePlus", 17));
       /* if (not(phones.isEmpty()))
            phones.forEach(System.out::println);
        phones.forEach(phone -> System.out.println(phone.make()));
        phones.forEach(CollectionsDemo::printPhoneMake);
        System.out.println(phones.contains(new Phone("Iphone", 12)));
        System.out.println(phones.indexOf(new Phone("LG", 34))); */

        Map<Long, Phone> phoneMap = new HashMap<>();
        phoneMap.put(2L,new Phone(2,"Iphone",12));
        phoneMap.put(5L,new Phone(5,"Sony",7));
        phoneMap.put(8L,new Phone(8,"OnePlus",17));
        phoneMap.put(47L,new Phone(47,"Motorola",99));

        System.out.println(phoneMap.get(8L));
        phoneMap.forEach((k,v) -> System.out.println(k+" - "+v));
        phoneMap.putIfAbsent(2L,new Phone(2,"test",34));

        System.out.println(phoneMap.getOrDefault(55L, new Phone(0,"",0)));


    }
    public static void printPhoneMake(Phone phone){
        System.out.println(phone.make());
    }
    private static boolean not(boolean empty) {
        return !empty;
    }

    public static List<Phone> getPhones (){
        return new ArrayList<>();
    }
}

record Phone(int key, String make, int memory){}
