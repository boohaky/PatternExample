package com.company.creational.abstractfactory;

import com.company.Test;
import com.company.creational.abstractfactory.factory.IWWEFactory;

public class AbstractFactoryTest implements Test<IWWEFactory>{


    public void run(IWWEFactory factory) {
        IWWEStar star = factory.createStar();
    }
}
