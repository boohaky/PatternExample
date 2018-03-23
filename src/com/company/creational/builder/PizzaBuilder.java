package com.company.creational.builder;

public class PizzaBuilder {

    Pizza pizza = new Pizza();

    public PizzaBuilder buildDough() {
        pizza.setDough("cross");
        return this;
    }

    public PizzaBuilder buildSauce() {
        pizza.setSauce("mild");
        return this;
    }

    public PizzaBuilder buildTopping() {
        pizza.setTopping("ham+pineapple");
        return this;
    }

    public Pizza build(){
        return pizza;
    }

}
