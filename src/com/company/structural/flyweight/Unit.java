package com.company.structural.flyweight;


public abstract class Unit {

    private String name;
    private int power;
    private Object texture;

    public Unit(String name, int power, Object texture) {
        this.name = name;
        this.power = power;
        this.texture = texture;
    }

}
