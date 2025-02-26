package patterns.decorator.thirdExample;

public abstract class ToppingDecorator implements Pizza {
    // Hold a reference to our plain pizza.
    protected Pizza pizza;

    // Constructor that is going ot be passed the reference to the plain pizza object that is going to be created.
    public ToppingDecorator(Pizza newPizza) {
        this.pizza = newPizza;
    }

    public String getDescription() {
        return pizza.getDescription();
    }

    public double getCost() {
        return pizza.getCost();
    }
}
