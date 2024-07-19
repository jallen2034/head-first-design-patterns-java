package patterns.factory.standard.store.NY;
import patterns.factory.standard.pizza.NY.NYStyleCheesePizza;
import patterns.factory.standard.pizza.NY.NYStylePepperoniPizza;
import patterns.factory.standard.pizza.Pizza;
import patterns.factory.standard.store.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
