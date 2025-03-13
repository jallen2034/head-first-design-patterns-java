package patterns.factory.standardSecondAttempt;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected List<String> toppings = new ArrayList<>();
    protected String dough;
    protected String sauce;

    // This could be abstract or have a default implementation
    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough: " + dough);
        System.out.println("Adding sauce: " + sauce);
        System.out.println("Adding toppings:");

        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    // These methods have default implementations but can be overridden
    public void bake() {
        System.out.println("Bake for 25 minutes at 350 degrees");
    }

    public void cut() {
        System.out.println("Cutting the pizza into round slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}