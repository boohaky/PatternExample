package com.company.creational.abstractfactory.factory;

import com.company.creational.abstractfactory.IWWEStar;
import com.company.creational.abstractfactory.RawSuperstar;

public class RawFacory implements IWWEFactory {

    @Override
    public IWWEStar createStar() {
        return new RawSuperstar();
    }

}
