package com.company.behaviour.cor.chains;

import com.company.behaviour.cor.Viewer;

public abstract class TVChain implements ITVChain {

    private ITVChain nextChain;

    public TVChain() {
    }

    public TVChain(ITVChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void setNextChain(ITVChain chain) {
        this.nextChain = chain;
    }

    @Override
    public void watch(Viewer viewer) {
        startWatching();
        viewer.showWatched();
        if (!viewer.isDead()) {
            if (nextChain != null) {
                nextChain.watch(viewer);
            } else {
                System.out.println("Still holding are't ya");
            }
        } else {
            System.out.println("No more things to left");
        }
    }

    protected abstract void startWatching();
}
