package com.company.behaviour.strategy;

import com.company.Test;

public class StrategyTest implements Test {

    @Override
    public void run(Object type) {
        HSGame game = new HSGame();
        game.setStrategy(new RushStrategy());
        game.play();
        game.setStrategy(new ControllStrategy());
        game.play();
    }
}
