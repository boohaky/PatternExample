package com.company.behaviour.cor;

public class Viewer {

    private int daysTillDeath;

    public Viewer(int daysTillDeath) {
        this.daysTillDeath = daysTillDeath;
    }

    public void showWatched() {
        daysTillDeath--;
    }

    public boolean isDead(){
        return daysTillDeath == 0;
    }

}
