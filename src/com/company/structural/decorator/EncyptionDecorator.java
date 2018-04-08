package com.company.structural.decorator;

public class EncyptionDecorator extends SaverDecorator{

    public EncyptionDecorator(IFileSaver wrap) {
        super(wrap);
    }

    @Override
    public void save() {
        System.out.println("Encrypt be boo bee");
        wrap.save();
    }
}
