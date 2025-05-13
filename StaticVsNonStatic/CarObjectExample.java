package patterns.StaticVsNonStatic;

/* Object example. When we instantiate an object from a class:
* 1. Memory is allocated on the heap for the specific instance of this class.
* 2. The constructor of this class runs, initializing the instance variables.
* 3. A reference to the specific memory location of the instance of this is returned and can be used later.
* 4. Each object has its own copy of instance variables, which is used to track it's own internal state.
* 5. Method calls on the object implicitly pass the object reference (this) as the first param.  */
public class CarObjectExample {
    private double speed;  // Instance variable - unique to each Car
    private final String color;

    public CarObjectExample(double initialSpeed, String color) {
        speed = initialSpeed;
        this.color = color;
    }

    public void accelerate(double amount) {
        speed += amount;
    }

    public String getColor() {
        return color;
    }

    public double getSpeed() {
        return speed;
    }
}
