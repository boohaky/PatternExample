package com.company.structural.flyweight;

public class Elf extends Unit {

    public Elf(String name, int power) {
        super(name, power, ImageFactory.getInstance().getImage(Elf.class));
    }
}
