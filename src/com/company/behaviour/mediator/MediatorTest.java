package com.company.behaviour.mediator;

import com.company.Test;

public class MediatorTest implements Test {

    @Override
    public void run(Object type) {
        RoomMediator mediator = new RoomMediator();
        final User user = new User("japan");
        user.setRoomMediator(mediator);
        user.sendMessage("hhaaduuken");
    }
}
