package DP03StarbuzzDecorator.Size;

import DP03StarbuzzDecorator.Root.Beverage;
import DP03StarbuzzDecorator.Root.PriceDecorator;

public class LargeCup extends PriceDecorator {
    public LargeCup(Beverage beverage) {
        this.beverage = beverage;
    }

    public double getPrice() {
        return beverage.getPrice() + 2.5;
    }
}
