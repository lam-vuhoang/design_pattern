package DP04PizzaFactory;

import DP04PizzaFactory.Factory.Pizza;
import DP04PizzaFactory.Factory.PizzaStore;
import DP04PizzaFactory.Store.ChicagoStore;
import DP04PizzaFactory.Store.NYPizzaStore;

public class ShowMe {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethen ordered a " + pizza.getName() + " --- \n");
        // nyStore.orderPizza("cheese");


        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + " --- \n");
        // chicagoStore.orderPizza("cheese");
    }
}
