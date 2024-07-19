package patterns.factory.standard.store;
import patterns.factory.standard.pizza.Pizza;

public abstract class PizzaStore {
    // Abstract method that must be implemented by subclasses to create specific types of pizzas.
    protected abstract Pizza createPizza(String type);

    // Order a pizza by type, following a sequence of preparation steps.
    public Pizza orderPizza(String type) {
        Pizza pizza = this.createPizza(type);

        // Call methods in the specific pizza to prepare, box, cut and bake it.
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        // Return the prepared pizza.
        return pizza;
    }
}
