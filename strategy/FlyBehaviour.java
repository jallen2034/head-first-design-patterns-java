package patterns.strategy;

// Interface defining the contract that concrete flying behaviors, such as FlyWithWings, it must adhere to
// This modular design which allows different flying behaviors to be easily implemented and
// conditionally used by various kinds of ducks in our Strategy Pattern.
public interface FlyBehaviour {
    void fly();
}
