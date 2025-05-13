package patterns.factory.standardSecondAttempt.concretePizzas;

import patterns.factory.standardSecondAttempt.Pizza;

public class ChicagoStyleMeatLovers extends Pizza {
    public ChicagoStyleMeatLovers() {
        name = "Chicago Style Meat Lovers";
        dough = "Extra thick Crust Dough";
        sauce = "BBQ Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    // The Chicago Style Meat Lovers Pizza also overrides the cut() method. so that the pieces are cut into squares.
    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
