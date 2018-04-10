package com.company.behaviour.cor.chains;

import com.company.behaviour.cor.Viewer;

public interface ITVChain {

    void setNextChain(ITVChain chain);

    void watch(Viewer viewer);

}
