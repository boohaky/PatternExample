package com.company.behaviour.command;

import com.company.Test;

public class CommandTest implements Test {

    @Override
    public void run(Object type) {
        Ken ken = new Ken();
        ken.setCommand(new Kick());
        ken.destroy();
        ken.setCommand(new Punch());
        ken.destroy();
    }
}
