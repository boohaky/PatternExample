package com.company.behaviour.state;

public class StateTest {

    public void run() {
        Country country = new Country();
        country.setCountryState(new PeaceState());
        country.day();
        country.setCountryState(new WarState());
        country.day();

    }
}
