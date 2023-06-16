package DP04PizzaFactory.Store;

import DP04PizzaFactory.Factory.Pizza;
import DP04PizzaFactory.Factory.PizzaStore;
import DP04PizzaFactory.Pizza.NYStyleCheesePizza;

public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        }

        else return null;
    }
}
