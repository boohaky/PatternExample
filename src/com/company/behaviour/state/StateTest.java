package com.company.behaviour.state;

import com.company.Test;

public class StateTest implements Test {

    @Override
    public void run(Object type) {
        Country country = new Country();
        country.setCountryState(new WarState(country));
        country.day();
    }
}
