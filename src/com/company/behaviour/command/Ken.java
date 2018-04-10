package com.company.behaviour.command;

public class Ken {

    private ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void destroy() {
        command.execute();
    }
}
