package patterns.factory.standardSecondAttempt.concretePizzaStores;

import patterns.factory.standardSecondAttempt.Pizza;
import patterns.factory.standardSecondAttempt.PizzaStore;
import patterns.factory.standardSecondAttempt.concretePizzas.NyStyleCheesePizza;
import patterns.factory.standardSecondAttempt.concretePizzas.NyStyleMeatLoversPizza;

public class NyPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NyStyleCheesePizza();
        } else if (type.equals("meatlovers")) {
            return new NyStyleMeatLoversPizza();
        } else {
            return null;
        }
    }
}
