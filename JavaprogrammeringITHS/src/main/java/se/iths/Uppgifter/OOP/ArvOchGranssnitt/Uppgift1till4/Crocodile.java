package se.iths.Uppgifter.OOP.ArvOchGranssnitt.Uppgift1till4;

import se.iths.Uppgifter.OOP.ArvOchGranssnitt.Uppgift12.NoiseMaker;

public class Crocodile extends Reptile implements NoiseMaker {
    public Crocodile(int nrOfLegs, String name, int weight, String sound) {
        super(nrOfLegs, name, weight, sound);
    }

    @Override
    public void makeNoise() {
        System.out.println("Croc croc");
    }
}
