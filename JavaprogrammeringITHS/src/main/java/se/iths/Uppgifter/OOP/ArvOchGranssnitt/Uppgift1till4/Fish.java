package se.iths.Uppgifter.OOP.ArvOchGranssnitt.Uppgift1till4;

import se.iths.Uppgifter.OOP.ArvOchGranssnitt.Uppgift12.NoiseMaker;

public class Fish extends Animal implements NoiseMaker {
    public Fish(int nrOfLegs, String name, int weight, String sound) {
        super(nrOfLegs, name, weight, sound);
    }

    @Override
    public void makeNoise() {
        System.out.println("Blub");
    }
}
