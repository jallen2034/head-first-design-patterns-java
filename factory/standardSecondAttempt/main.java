package patterns.factory.standardSecondAttempt;

import patterns.factory.standardSecondAttempt.concretePizzaStores.ChicagoPizzaStore;
import patterns.factory.standardSecondAttempt.concretePizzaStores.NyPizzaStore;

public class main {
    public static void main(String[] args) {
        // Instantiate pizza store factories for NY and Italian styles.
        PizzaStore NYPizzaStore = new NyPizzaStore();
        PizzaStore ChicagoPizzaStore = new ChicagoPizzaStore();

        // Create cheese pizzas of both NY and Chicago types.
        Pizza nyCheesePizza = NYPizzaStore.orderPizza("cheese");
        Pizza chicagoCheesePizza = ChicagoPizzaStore.orderPizza("cheese");

        // Create meat-lovers pizzas of both NY and Chicago Types.
        Pizza nyMeatloversPizza = NYPizzaStore.orderPizza("meatlovers");
        Pizza chicagoMeatloversPizza = ChicagoPizzaStore.orderPizza("meatlovers");

        // Display properties of these pizzas, Right now it's just the name but we could extend this.
        System.out.println("This is your ny and chicago cheese pizzas sir");
        System.out.println(nyCheesePizza.getName());
        System.out.println(chicagoCheesePizza.getName());

        System.out.println("This is your ny and chicago meat-lovers pizzas sir");
        System.out.println(nyMeatloversPizza.getName());
        System.out.println(chicagoMeatloversPizza.getName());
    }
}
