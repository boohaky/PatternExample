package com.company.behaviour.state;

public class StateTest {

    public void run() {
        Country country = new Country();
        country.setCountryState(new WarState(country));
        country.day();
    }
}
