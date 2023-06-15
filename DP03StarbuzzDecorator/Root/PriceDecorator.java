package DP03StarbuzzDecorator.Root;

public abstract class PriceDecorator extends Beverage {
    protected Beverage beverage;

    public abstract double getPrice();
}
