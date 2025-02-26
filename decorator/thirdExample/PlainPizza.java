package patterns.decorator.thirdExample;

public class PlainPizza implements Pizza {
    // Constructor


    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
