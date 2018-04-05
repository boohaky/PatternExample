package com.company.structural.bridge.godDestoyers;

import com.company.structural.bridge.heroes.ISuperHero;

public abstract class GodDestroyer {

    private ISuperHero superHero;

    public GodDestroyer(ISuperHero superHero) {
        this.superHero = superHero;
    }

    public void punchGod(){
        superHero.useMainPower();
    }

    public void punchSecondaryVillian(){
        superHero.useSecondaryPower();
    }
}
