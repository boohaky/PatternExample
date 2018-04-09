package com.company.structural.proxy;

public class Room implements IRoomWork {

    @Override
    public void cleanRoom() {
        System.out.println("Ooooh, cleean");
    }

    @Override
    public void destroyRoom(){
        System.out.println("Destrooooooy");
    }
}
