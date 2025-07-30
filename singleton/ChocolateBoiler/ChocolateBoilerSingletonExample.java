package patterns.singleton.ChocolateBoiler;

public class ChocolateBoilerSingletonExample {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoilerSingletonExample uniqueInstance;

    private ChocolateBoilerSingletonExample() {
        empty = true;
        boiled = false;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public static ChocolateBoilerSingletonExample getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoilerSingletonExample();
        }
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            // Fill the boiler with milk and chocolate
            empty = false;
            System.out.println("Filling the boiler");
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // Bring the contents to a boil
            boiled = true;
            System.out.println("Boiling the contents");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // Drain the boiled milk and chocolate
            empty = true;
            boiled = false;
            System.out.println("Draining the boiler");
        }
    }

    // Main method inside the class
    public static void main(String[] args) {
        System.out.println("SINGLETON PATTERN TEST:");

        // Get the first instance using the proper method.
        ChocolateBoilerSingletonExample boiler1 = ChocolateBoilerSingletonExample.getUniqueInstance();
        System.out.println("First instance: " + boiler1);

        // Get the second instance - should be the same object.
        ChocolateBoilerSingletonExample boiler2 = ChocolateBoilerSingletonExample.getUniqueInstance();
        System.out.println("Second instance: " + boiler2);

        // Test if they are the same object.
        System.out.println("Are they the same object? " + (boiler1 == boiler2));

        // Demonstrate shared state.
        System.out.println("\nDemonstrating shared state:");
        System.out.println("Boiler1 initial state - Empty: " + boiler1.isEmpty() + ", Boiled: " + boiler1.isBoiled());

        // Use first instance to fill.
        boiler1.fill();

        // Check if second instance reflects the change.
        System.out.println("After boiler1.fill() - Boiler2 state - Empty: " + boiler2.isEmpty() + ", Boiled: " + boiler2.isBoiled());
    }
}