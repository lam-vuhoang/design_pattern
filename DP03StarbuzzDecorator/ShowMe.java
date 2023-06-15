package DP03StarbuzzDecorator;

import DP03StarbuzzDecorator.Blend.Mocha;
import DP03StarbuzzDecorator.Size.LargeCup;
import DP03StarbuzzDecorator.Size.SmallCup;

public class ShowMe {
    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        Mocha mocha = new Mocha(espresso);

        System.out.println("Espresso cost: " + espresso.getPrice());
        System.out.println("Mocha cost: " + mocha.getPrice());

        mocha = new Mocha(mocha);
        System.out.println("Mocha 2 cost: " + mocha.getPrice());

        SmallCup smallCup = new SmallCup(mocha);
        System.out.println("Small Cup Mocha: " + smallCup.getPrice());

        LargeCup largeCup = new LargeCup(mocha);
        System.out.println("Large Cup Mocha: " + largeCup.getPrice());
    }
}
