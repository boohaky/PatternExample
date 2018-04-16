package com.company.behaviour.state;

public abstract class CountryState {

    protected Country country;

    CountryState(Country country) {
        this.country = country;
    }

    public abstract void buildTavern();

    public abstract void buildBarrack();
}
