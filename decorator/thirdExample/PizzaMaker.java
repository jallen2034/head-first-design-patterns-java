package patterns.decorator.thirdExample;

public class PizzaMaker {
    public static void main(String[] args) {
        Pizza plainPizza = new PlainPizza();
        Pizza mozzarellaPizza = new Mozzarella(plainPizza);
        Pizza tomatoMozzarellaPizza = new TomatoSauce(mozzarellaPizza);

        System.out.println(tomatoMozzarellaPizza.getDescription());
        System.out.println(tomatoMozzarellaPizza.getCost());
    }
}
