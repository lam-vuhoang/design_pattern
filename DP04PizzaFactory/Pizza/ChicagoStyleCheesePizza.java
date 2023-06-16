package DP04PizzaFactory.Pizza;

import DP04PizzaFactory.Factory.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago style Deep dish cheese pizza";
        dough = "Extra thick crust dough";
        sauce = "Plum tomato sauce";

        toppings.add("Shredded Mozzarella cheese");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices...");
    }
}
