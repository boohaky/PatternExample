package com.company.behaviour.cor;

import com.company.Test;
import com.company.behaviour.cor.chains.Coommunity;
import com.company.behaviour.cor.chains.ITVChain;
import com.company.behaviour.cor.chains.Leftovers;
import com.company.behaviour.cor.chains.TwenPeaks;

public class CORTest implements Test {

    @Override
    public void run(Object type) {
        final Viewer viewer = new Viewer(5);
        ITVChain chainOne = new Leftovers();
        ITVChain chainTwo = new TwenPeaks();
        ITVChain chainThree = new Coommunity();
        chainOne.setNextChain(chainTwo);
        chainTwo.setNextChain(chainThree);
        chainOne.watch(viewer);
    }

}
