package DP04PizzaFactory.Store;

import DP04PizzaFactory.Factory.Pizza;
import DP04PizzaFactory.Factory.PizzaStore;
import DP04PizzaFactory.Pizza.ChicagoStyleCheesePizza;

public class ChicagoStore extends PizzaStore {
    public Pizza createPizza(String item) {
        if(item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }

        return null;
    }
}
