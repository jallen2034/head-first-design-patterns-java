package patterns.factory.standardSecondAttempt.concretePizzas;

import patterns.factory.standardSecondAttempt.Pizza;

public class NyStyleMeatLoversPizza extends Pizza {
    public NyStyleMeatLoversPizza() {
        name = "Ny Style Meat Lovers";
        dough = "Thin Crust Dough";
        sauce = "BBQ Sauce";
        toppings.add("Grated Reggiano Cheese");
    }

    // The NY Style Meatlovers Pizza also overrides the cut() method. so that the pieces are cut into diagonals.
    @Override
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
}
