package org.example;

public class Mocha extends Decorator{
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return decoratorBeverage.getDescription()+" with mocha";
    }

    @Override
    public Double getCost() {
        return decoratorBeverage.getCost()+2.25;
    }
}
