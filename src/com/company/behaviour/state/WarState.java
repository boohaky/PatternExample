package com.company.behaviour.state;

public class WarState extends CountryState {

    WarState(Country country) {
        super(country);
    }

    @Override
    public void buildTavern() {
        System.out.println("What, why?");
    }

    @Override
    public void buildBarrack() {
        System.out.println("Yeah, build one");
        country.setCountryState(new WarState(country));
    }
}
