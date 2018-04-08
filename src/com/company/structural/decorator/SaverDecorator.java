package com.company.structural.decorator;

public abstract class SaverDecorator implements IFileSaver {

    protected final IFileSaver wrap;

    public SaverDecorator(IFileSaver wrap) {
        this.wrap = wrap;
    }

}
