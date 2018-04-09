package com.company.structural.flyweight;

public class FlyWeightTest {

    public void run() {

        for (int i = 0; i < 100; i++) {
            new Elf("Elf " + i, i);
        }

        for (int i = 0; i < 100; i++) {
            new Ork("Ork " + i, i);
        }
    }
}
