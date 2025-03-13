package patterns.factory.standardSecondAttempt.concretePizzas;

import patterns.factory.standardSecondAttempt.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Cheese Pizza";
        dough = "Extra thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    // The Chicago Style Cheese Pizza also overrides the cut() method. so that the pieces are cut into squares.
    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
