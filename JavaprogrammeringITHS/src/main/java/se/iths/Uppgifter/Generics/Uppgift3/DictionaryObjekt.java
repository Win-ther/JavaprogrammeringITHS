package se.iths.Uppgifter.Generics.Uppgift3;

import se.iths.Uppgifter.OOP.ArvOchGranssnitt.Uppgift1till4.*;

import java.util.HashMap;

public class DictionaryObjekt {
    public static void main(String[] args) {
        HashMap<String, Animal> map = new HashMap<>();
        Cow cow = new Cow(4,"Arabella",280,"Moo");
        Sunfish sunfish = new Sunfish(0,"Sunny",4,"BLUB");
        Crocodile crocodile = new Crocodile(4,"Crocco the croc",340,"ROAR");
        Crow crow = new Crow(2,"CroBat",1,"KAW");
        Animal a = new Mammal(7,"Undefined",Integer.MAX_VALUE,"sound");
        map.put("Cow",cow);
        map.put("Sunfish",sunfish);
        map.put("Crocodile",crocodile);
        map.put("Crow",crow);
        map.put("ANIMAL",a);

        System.out.println(map.get("Crocodile").getName());
        System.out.println(map.get("Crow").getName());
        System.out.println(map.get("ANIMAL").getName());
    }
}
