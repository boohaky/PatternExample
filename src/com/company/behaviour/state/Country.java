package com.company.behaviour.state;

public class Country {

    private CountryState countryState;

    public void setCountryState(CountryState countryState) {
        this.countryState = countryState;
    }

    public void day() {
        countryState.buildBarrack();
        countryState.buildTavern();
    }
}
