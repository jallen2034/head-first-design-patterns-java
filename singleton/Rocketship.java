package patterns.singleton;

public class Rocketship {

    // Class level static instance
    private static Rocketship rocketship;

    // Private Constructor to prevent multiple instances of this class being instantiated. This does nothing.
    private Rocketship() { }

    // Factory method to retrieve instance
    public static Rocketship getInstance() {
        if (rocketship == null) {
            // Use a synchronized block to ensure only 1 thread can enter this section of code at once.
            synchronized (Rocketship.class) {
                rocketship = new Rocketship();
            }
        }

        return rocketship;
    }
}








