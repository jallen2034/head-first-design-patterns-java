package patterns.factory.standardSecondAttempt.concretePizzas;

import patterns.factory.standardSecondAttempt.Pizza;

public class NyStyleCheesePizza extends Pizza {
    public NyStyleCheesePizza() {
        name = "Ny Style Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }

    // The NY Style Cheese Pizza also overrides the cut() method. so that the pieces are cut into diagonals.
    @Override
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
}
