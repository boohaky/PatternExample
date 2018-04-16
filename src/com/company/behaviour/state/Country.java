package com.company.behaviour.state;

public class Country {

    private ICountryState countryState;


    public void setCountryState(ICountryState countryState) {
        this.countryState = countryState;
    }

    public void day(){
        countryState.buildBarrack();
        countryState.buildTavern();
    }
}
