package patterns.strategy.quack;

// All quack behaviors implement this interface, allowing ducks to have different quacking behaviors.
public interface QuackBehaviour {
    // Method to be implemented by specific quack behaviors.
    public void quack();
}
