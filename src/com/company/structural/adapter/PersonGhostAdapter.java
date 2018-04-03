package com.company.structural.adapter;

public class PersonGhostAdapter implements IGhostScares {

    private Person person;

    public PersonGhostAdapter(Person person) {
        this.person = person;
    }

    //first option
    public static Ghost convertToGhost(Person person) {
        final Ghost ghost = new Ghost();
        ghost.density = person.weight / 100;
        ghost.yearsToReborn = person.yearsToDie * 100;
        return ghost;
    }

    @Override
    public void makeBoo() {
        float density = person.weight / 100 * 2;
        System.out.println("Wait, what?");
    }
}
