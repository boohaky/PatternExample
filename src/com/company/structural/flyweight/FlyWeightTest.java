package com.company.structural.flyweight;

import com.company.Test;

public class FlyWeightTest implements Test {

    @Override
    public void run(Object type) {
        for (int i = 0; i < 100; i++) {
            new Elf("Elf " + i, i);
        }

        for (int i = 0; i < 100; i++) {
            new Ork("Ork " + i, i);
        }
    }
}
