package DP04PizzaFactory.Factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<String>();

    public void prepare() {
        System.out.println("1a. Preparing " + name);
        System.out.println("1b. Tossing dought... ");
        System.out.println("1c. Adding toppings: ");

        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    };

    public void bake() {
        System.out.println("2) Baking for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("3) Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("4) Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
