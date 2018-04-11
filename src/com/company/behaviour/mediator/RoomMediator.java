package com.company.behaviour.mediator;

public class RoomMediator {

    public void showMessage(User user, String message){
        System.out.println("User: " + user.getName() + "message: " + message);
    }
}
