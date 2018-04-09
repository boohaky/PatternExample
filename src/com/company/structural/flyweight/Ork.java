package com.company.structural.flyweight;

public class Ork extends Unit {

    public Ork(String name, int power) {
        super(name, power, ImageFactory.getInstance().getImage(Ork.class));
    }
}
