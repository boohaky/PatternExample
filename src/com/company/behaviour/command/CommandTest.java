package com.company.behaviour.command;

public class CommandTest {

    public void run() {
        Ken ken = new Ken();
        ken.setCommand(new Kick());
        ken.destroy();
        ken.setCommand(new Punch());
        ken.destroy();
    }

}
