package com.company.behaviour.command;

public class Punch implements ICommand {

    @Override
    public void execute() {
        System.out.println("Haduken SHANKUKEN!");
    }

}
