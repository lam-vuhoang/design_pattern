package DP03StarbuzzDecorator.Size;

import DP03StarbuzzDecorator.Root.Beverage;
import DP03StarbuzzDecorator.Root.PriceDecorator;

public class SmallCup extends PriceDecorator {
    public SmallCup(Beverage beverage) {
        this.beverage = beverage;
    }

    public double getPrice() {
        return beverage.getPrice() - .5;
    }
}
