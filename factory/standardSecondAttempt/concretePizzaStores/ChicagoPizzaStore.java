package patterns.factory.standardSecondAttempt.concretePizzaStores;

import patterns.factory.standardSecondAttempt.Pizza;
import patterns.factory.standardSecondAttempt.PizzaStore;
import patterns.factory.standardSecondAttempt.concretePizzas.ChicagoStyleCheesePizza;
import patterns.factory.standardSecondAttempt.concretePizzas.ChicagoStyleMeatLovers;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("meatlovers")) {
            return new ChicagoStyleMeatLovers();
        } else {
            return null;
        }
    }
}
