package patterns.strategy;

// implements our fly with wings interface and abides to the contract set
public class FlyWithWings implements FlyBehaviour {

    // Method that provides the flying functionality for ducks and their subclasses.
    // This approach allows different types of ducks to utilize or override the flying behavior.
    // as needed, promoting flexibility and modularity in defining diverse flying behaviors.
    @Override
    public void fly() {
        System.out.println("I'm Flying!!!");
    }
}
