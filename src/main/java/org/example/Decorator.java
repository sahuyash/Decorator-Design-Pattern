package org.example;

public abstract class Decorator implements Beverage {
    protected Beverage decoratorBeverage;

    public Decorator(Beverage beverage){
        this.decoratorBeverage = beverage;
    }
}
