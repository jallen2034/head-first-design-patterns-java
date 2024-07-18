package patterns.factory.standard.store;
import patterns.factory.standard.pizza.Pizza;

public abstract class PizzaStore {
    // Order a pizza by type, following a sequence of preparation steps.
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        // Call methods in the specific pizza to prepare, box, cut and bake it.
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        // Return the instance of this pizza we ordered back to where it is needed.
        return pizza;
    }

    // Abstract method that whatever subclass pizza store will need to be a contract to in order ot create a pizza.
    protected abstract Pizza createPizza(String type);
}
