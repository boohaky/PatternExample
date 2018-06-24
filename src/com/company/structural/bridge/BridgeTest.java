package com.company.structural.bridge;

import com.company.Test;
import com.company.structural.bridge.godDestoyers.BatMehSuits;
import com.company.structural.bridge.godDestoyers.GodDestroyer;
import com.company.structural.bridge.heroes.Batman;
import com.company.structural.bridge.heroes.Superman;

public class BridgeTest implements Test {


    @Override
    public void run(Object type) {
        GodDestroyer godDestroyer = new BatMehSuits(new Superman());
        godDestroyer.punchGod();

        godDestroyer = new BatMehSuits(new Batman());
        godDestroyer.punchSecondaryVillian();
    }
}
