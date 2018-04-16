package com.company.behaviour.state;

public class PeaceState implements ICountryState {

    @Override
    public void buildTavern() {
        System.out.println("Yeah, build one");
    }

    @Override
    public void buildBarrack() {
        System.out.println("What, why?");
    }
}
