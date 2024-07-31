package patterns.strategy;

// Abstract class representing a Duck that can have different flying behaviors.
public abstract class Duck {
    // Instance variable to hold the specific flying behavior of the duck.
    protected FlyBehaviour flyBehaviour;

    // Constructor to initialize the Duck with a specific flying behavior
    // This demonstrates composition over inheritance by allowing dynamic behavior changes :)
    public Duck(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    // Method to perform flying, which delegates the flying action to the flyBehaviour instance
    // This allows subclasses to change the flying behavior without altering the Duck class itself
    public void performFly() {
        flyBehaviour.fly();
    }
}
