package patterns.factory.standard.store.Italian;
import patterns.factory.standard.pizza.Italian.ItalianStyleCheesePizza;
import patterns.factory.standard.pizza.Italian.ItalianStylePepperoniPizza;
import patterns.factory.standard.pizza.Pizza;
import patterns.factory.standard.store.PizzaStore;

public class ItalianPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ItalianStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new ItalianStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
