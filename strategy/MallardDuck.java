package patterns.strategy;

// Concrete subclass of Duck representing a Mallard Duck.
public class MallardDuck extends Duck {

    // Constructor for MallardDuck, takes a FlyBehaviour instance and passes it to the super class.
    public MallardDuck(FlyBehaviour flyBehaviour) {
        super(flyBehaviour);
    }

    // Overriding performFly to use the fly method defined in the flyBehaviour instance.
    // This allows the MallardDuck to exhibit its specific flying behavior as defined by the FlyBehaviour.
    @Override
    public void performFly() {
        flyBehaviour.fly();
    }
}
