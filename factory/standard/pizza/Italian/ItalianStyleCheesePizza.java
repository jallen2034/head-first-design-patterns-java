package patterns.factory.standard.pizza.Italian;
import patterns.factory.standard.pizza.Pizza;

public class ItalianStyleCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing `Italian Style Cheese Pizza...");
    }

    @Override
    public void bake() {
        System.out.println("Baking `Italian Style Cheese Pizza...");
    }

    @Override
    public void cut() {
        System.out.println("Cutting `Italian Style Cheese Pizza...");
    }

    @Override
    public void box() {
        System.out.println("Boxing `Italian Style Cheese Pizza...");
    }
}
