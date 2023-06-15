package DP03StarbuzzDecorator;

import DP03StarbuzzDecorator.Root.Beverage;

public class HouseBlend extends Beverage {
    
    public HouseBlend() {
        description = "HouseBlend";
    }

    public double getPrice() {
        return .89;
    }
}
