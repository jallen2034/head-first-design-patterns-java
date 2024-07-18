package patterns.factory.standard.pizza.Italian;
import patterns.factory.standard.pizza.Pizza;

public class ItalianStylePepperoniPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing Italian Style Pepperoni Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Italian Style Pepperoni Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut Italian Style Pepperoni Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Italian Style Pepperoni Pizza");
    }
}
