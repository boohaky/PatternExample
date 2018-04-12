package com.company.behaviour.memento;

public class Blashcovich {

    private String gun;
    private int health = 100;

    private Snapshot snapshot;


    public String getGun() {
        return gun;
    }

    public void setGun(String gun) {
        this.gun = gun;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void creaeateSnapshot() {
        snapshot = new Snapshot();
    }

    public void restoreChanges() {
        health = snapshot.snapHealth;
    }

    private class Snapshot {

        int snapHealth;

        Snapshot() {
            this.snapHealth = health;
        }
    }
}
