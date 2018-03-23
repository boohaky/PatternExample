package com.company.creational.builder;

import com.company.Test;

public class BuilderTest implements Test<PizzaBuilder> {

    @Override
    public void run(PizzaBuilder type) {
        type.buildDough().buildSauce().buildTopping().build();
    }
}
