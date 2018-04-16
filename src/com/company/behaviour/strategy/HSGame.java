package com.company.behaviour.strategy;

public class HSGame {

    private IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void play() {
        if (strategy != null) {
            strategy.execute();
        }
    }
}
