package com.company.structural.proxy;

import com.company.Test;

public class ProxyTest implements Test<Room> {

    @Override
    public void run(Room room) {
        final RoomProxy roomProxy = new RoomProxy(room);
        room.cleanRoom();
        roomProxy.destroyRoom();
    }
}
