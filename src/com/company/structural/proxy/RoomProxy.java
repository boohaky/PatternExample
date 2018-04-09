package com.company.structural.proxy;

public class RoomProxy implements IRoomWork {

    private Room room;

    public RoomProxy(Room room) {
        this.room = room;
    }

    @Override
    public void cleanRoom() {
        System.out.println("Buuy some cleaning stuff");
        room.cleanRoom();
    }

    @Override
    public void destroyRoom() {
        System.out.println("Buuy some exposive stuff");
        room.destroyRoom();
    }
}
