package DP03StarbuzzDecorator;

import DP03StarbuzzDecorator.Root.Beverage;

public class Espresso extends Beverage {
    
    public Espresso() {
        description = "Espresso";
    }

    public double getPrice() {
        return 1.99;
    }
}
