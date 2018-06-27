package com.company.behaviour.mediator;

public class User {

    private String name;
    private RoomMediator roomMediator;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void setRoomMediator(RoomMediator roomMediator) {
        this.roomMediator = roomMediator;
    }

    public void sendMessage(String message) {
        roomMediator.showMessage(this, message);
    }
}
