package patterns.strategy.ducks;

import patterns.strategy.behaviours.FlyNoWay;
import patterns.strategy.quack.Squeak;

/* A RubberDuck is a specific type of Duck. It has its own
 * display method and uses specific behaviors for quacking and flying. */
public class RubberDuck extends Duck {
    // Constructor sets the behaviors for RubberDuck.
    public RubberDuck() {
        quackBehavior = new Squeak(); // Rubber ducks squeak.
        flyBehavior = new FlyNoWay(); // Rubber ducks can't fly.
    }

    // Displays the specific appearance of a RubberDuck.
    @Override
    public void display() {
        System.out.println("I'm a rubber duckie :)");
    }
}
