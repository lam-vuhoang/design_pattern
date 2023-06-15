package DP03StarbuzzDecorator.Blend;

import DP03StarbuzzDecorator.Root.Beverage;
import DP03StarbuzzDecorator.Root.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double getPrice() {
        return beverage.getPrice() + .20;
    }
}
