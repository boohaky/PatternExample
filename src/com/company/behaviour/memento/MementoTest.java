package com.company.behaviour.memento;

import com.company.Test;

public class MementoTest implements Test<Blashcovich> {

    @Override
    public void run(Blashcovich blashcovich) {
        blashcovich.creaeateSnapshot();
        blashcovich.setHealth(80);
        blashcovich.setHealth(60);
        blashcovich.restoreChanges();
    }
}
