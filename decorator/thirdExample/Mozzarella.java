package patterns.decorator.thirdExample;

public class Mozzarella extends ToppingDecorator {
    public Mozzarella(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Mozzarella";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.50;
    }
}
