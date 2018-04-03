package com.company.structural.adapter;

public class Ghost implements IGhostScares {

    int yearsToReborn;
    float density;

    public void makeBoo() {
        density = density * 2;
        System.out.println("Actually it's does not matter, ghost do not exist, you just gonna die");
    }
}
