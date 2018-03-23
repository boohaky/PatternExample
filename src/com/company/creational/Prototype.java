package com.company.creational;

public class Prototype implements Cloneable {

    String type = "japan";

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Prototype();
    }
}
