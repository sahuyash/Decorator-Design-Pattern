package org.example;

public class DarkRoastCoffee implements Beverage {
    @Override
    public String getDescription() {
        return "Dark Roast coffee";
    }

    @Override
    public Double getCost() {
        return 20.00;
    }
}
