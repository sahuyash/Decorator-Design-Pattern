package org.example;

public class Milk extends Decorator{
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return decoratorBeverage.getDescription()+" with milk";
    }

    @Override
    public Double getCost() {
        return decoratorBeverage.getCost()+5.00;
    }
}
