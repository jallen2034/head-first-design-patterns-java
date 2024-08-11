package patterns.strategy.ducks;

import patterns.strategy.behaviours.FlyBehaviour;
import patterns.strategy.quack.QuackBehaviour;

/* Abstract Duck class that serves as the base class for all duck types.
 * This class defines behaviors for flying and quacking that can be changed at runtime,
 * allowing different ducks to have different behaviors without changing their code. */
public abstract class Duck {
    /* Each Duck uses composition (over inheritance!) to set FlyBehaviour and
     * QuackBehaviour, allowing dynamic changes to these behaviors at runtime. */
    FlyBehaviour flyBehavior;
    QuackBehaviour quackBehavior;

    // Default Constructor.
    public Duck() {}

    // Abstract method to be implemented by subclasses to display a specific type of Duck.
    public abstract void display();

    // Performs the fly behavior, which can be set or changed at runtime.
    public void performFly() {
        flyBehavior.fly();
    }

    // Performs the quack behavior, which can be set or changed at runtime.
    public void performQuack() {
        quackBehavior.quack();
    }

    // Allows changing the FlyBehaviour at runtime, demonstrating flexibility.
    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehavior = fb;
    }

    // Allows changing the QuackBehaviour at runtime, demonstrating flexibility.
    public void setQuackBehavior(QuackBehaviour b) {
        quackBehavior = b;
    }

    // Common method for all ducks; all ducks can swim.
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
