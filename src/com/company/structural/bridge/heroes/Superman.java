package com.company.structural.bridge.heroes;

public class Superman implements ISuperHero {

    @Override
    public void useMainPower() {
        System.out.println("laser beeeem");
    }

    @Override
    public void useSecondaryPower() {
        System.out.println("meegaaaa puuuunch");
    }

    @Override
    public void lookDope() {
        System.out.println("Nice S");
    }
}
