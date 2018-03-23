package com.company.creational.abstractfactory.factory;

import com.company.creational.abstractfactory.IWWEStar;
import com.company.creational.abstractfactory.SmackdownSuperstar;

public class SmackdownFactory implements IWWEFactory {

    @Override
    public IWWEStar createStar() {
        return new SmackdownSuperstar();
    }

}
