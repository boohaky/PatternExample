package com.company.structural.bridge.heroes;

public class Batman implements ISuperHero {

    @Override
    public void useMainPower() {
        System.out.println("Detective work");
    }

    @Override
    public void useSecondaryPower() {
        System.out.println("Punch!");
    }

    @Override
    public void lookDope() {
        System.out.println("I'm Batman");
    }
}
