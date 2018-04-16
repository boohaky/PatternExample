package com.company.behaviour.strategy;

public class RushStrategy implements IStrategy {

    @Override
    public void execute() {
        System.out.println("Bunch of 1 mana cards");
        System.out.println("RUSH RUSH RUSH");
    }
}
