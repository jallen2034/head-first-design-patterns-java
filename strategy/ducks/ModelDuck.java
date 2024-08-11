package patterns.strategy.ducks;
import patterns.strategy.behaviours.FlyNoWay;
import patterns.strategy.quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        // Our model duck begins life grounded and can't fly :(
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
