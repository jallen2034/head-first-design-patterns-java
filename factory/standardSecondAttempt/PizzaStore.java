package patterns.factory.standardSecondAttempt;

public abstract class PizzaStore {
    // This 'create pizza' method is abstract and the explicit type of pizza created is handled by the child explicit
    // type of store that implements this abstract class (such as a ChicagoPizzaStore, NyPizzaStore etc)
    protected abstract Pizza createPizza(String type);

    // Takes in the pizza type as a string.
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        // Call methods in the specific pizza to prepare, box, cut and bake it.
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        // Return the prepared pizza.
        return pizza;
    }
}
