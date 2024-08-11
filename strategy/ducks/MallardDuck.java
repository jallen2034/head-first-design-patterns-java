package patterns.strategy.ducks;

import patterns.strategy.behaviours.FlyWithWings;
import patterns.strategy.quack.Quack;

/* MallardDuck is a specific type of Duck. It has its own display
 * method and uses specific behaviors for quacking and flying. */
public class MallardDuck extends Duck {
    // Constructor sets the behaviors for MallardDuck.
    public MallardDuck() {
        quackBehavior = new Quack(); // Mallard ducks quack.
        flyBehavior = new FlyWithWings(); // Mallard ducks can fly with wings.
    }

    // Displays the specific appearance of a MallardDuck.
    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
