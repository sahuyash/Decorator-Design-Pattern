package org.example;

public class Espresso implements Beverage {
    @Override
    public String getDescription() {
        return "Espresso Coffee";
    }

    @Override
    public Double getCost() {
        return 25.00;
    }
}
