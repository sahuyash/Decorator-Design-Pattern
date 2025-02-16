package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Decorator Pattern");
        Beverage espresso = new Espresso();
        espresso = new Milk(espresso);
        espresso= new Milk(espresso);
        espresso= new Mocha(espresso);
        System.out.println(espresso.getCost());
        System.out.println(espresso.getDescription());
    }
}