package com.company.behaviour.memento;

public class MementoTest {

    public void run() {

        Blashcovich blashcovich = new Blashcovich();
        blashcovich.creaeateSnapshot();
        blashcovich.setHealth(80);
        blashcovich.setHealth(60);
        blashcovich.restoreChanges();
    }
}
