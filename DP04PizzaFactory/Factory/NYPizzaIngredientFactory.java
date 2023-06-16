package DP04PizzaFactory.Factory;

import DP04PizzaFactory.Ingredients.Dough;
import DP04PizzaFactory.Ingredients.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }
}
