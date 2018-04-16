package com.company.behaviour.state;

public class WarState implements ICountryState {

    @Override
    public void buildTavern() {
        System.out.println("What, why?");
    }

    @Override
    public void buildBarrack() {
        System.out.println("Yeah, build one");
    }
}
