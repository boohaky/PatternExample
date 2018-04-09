package com.company.structural.flyweight;

import java.awt.*;

public abstract class Unit {

    private String name;
    private int power;
    private Image texture;

    public Unit(String name, int power, Image texture) {
        this.name = name;
        this.power = power;
        this.texture = texture;
    }

}
