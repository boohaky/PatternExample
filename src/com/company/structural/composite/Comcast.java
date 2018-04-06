package com.company.structural.composite;

public class Comcast implements INetwork {

    private INetwork[] networks;

    public Comcast(INetwork[] networks) {
        this.networks = networks;
    }

    @Override
    public void stealSomeShit() {
        for (INetwork network: networks) {
            network.stealSomeShit();
        }
    }
}
