package com.company.behaviour.strategy;

public class StrategyTest {

    public void run() {
        HSGame game = new HSGame();
        game.setStrategy(new RushStrategy());
        game.play();
        game.setStrategy(new ControllStrategy());
        game.play();
    }
}
