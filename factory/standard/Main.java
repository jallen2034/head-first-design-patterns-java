package patterns.factory.standard;
import patterns.factory.standard.pizza.Pizza;
import patterns.factory.standard.store.Italian.ItalianPizzaStore;
import patterns.factory.standard.store.NY.NYPizzaStore;
import patterns.factory.standard.store.PizzaStore;

public class Main {
    public static void main(String[] args) {
        // Instantiate pizza store factories for NY and Italian styles.
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore italianPizzaStore = new ItalianPizzaStore();

        // Create different types of pizzas using specific pizza store factories.
        Pizza pepperoniPizzaNYStyle = nyPizzaStore.orderPizza("pepperoni");
        Pizza cheesePizzaNyStyle = nyPizzaStore.orderPizza("cheese");
        Pizza cheesePizzaItalianStyle = italianPizzaStore.orderPizza("cheese");
        Pizza pepperoniPizzaItalianStyle = italianPizzaStore.orderPizza("pepperoni");

        // Log out our pizzas :)
        System.out.println(pepperoniPizzaNYStyle);
        System.out.println(cheesePizzaNyStyle);
        System.out.println(cheesePizzaItalianStyle);
        System.out.println(pepperoniPizzaItalianStyle);
    }
}
