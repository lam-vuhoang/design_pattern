package DP04PizzaFactory.Factory;

import DP04PizzaFactory.Ingredients.Cheese;
import DP04PizzaFactory.Ingredients.Clams;
import DP04PizzaFactory.Ingredients.Dough;
import DP04PizzaFactory.Ingredients.Pepperoni;
import DP04PizzaFactory.Ingredients.Sauce;
import DP04PizzaFactory.Ingredients.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    // public Sauce createSauce();
    // public Cheese createCheese();
    // public Veggies[] createVeggies();
    // public Pepperoni createPepperoni();
    // public Clams createClams();
}
