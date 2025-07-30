package patterns.singleton.ChocolateBoiler;

public class ChocolateBoilerNonSingletonExample {
    private boolean empty;
    private boolean boiled;

    public ChocolateBoilerNonSingletonExample() {
        empty = true;
        boiled = false;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
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
        System.out.println("NON-SINGLETON PATTERN TEST:");

        // Create two separate instances.
        ChocolateBoilerNonSingletonExample boiler1 = new ChocolateBoilerNonSingletonExample();
        System.out.println("First instance: " + boiler1);

        ChocolateBoilerNonSingletonExample boiler2 = new ChocolateBoilerNonSingletonExample();
        System.out.println("Second instance: " + boiler2);

        // Test if they are different objects.
        System.out.println("Are they different objects? " + (boiler1 != boiler2));

        // Demonstrate independent state.
        System.out.println("\nDemonstrating independent state:");
        System.out.println("Boiler1 initial state - Empty: " + boiler1.isEmpty() + ", Boiled: " + boiler1.isBoiled());
        System.out.println("Boiler2 initial state - Empty: " + boiler2.isEmpty() + ", Boiled: " + boiler2.isBoiled());

        // Change state of first boiler.
        boiler1.fill();

        // Show that second boiler is unaffected.
        System.out.println("After boiler1.fill() - Boiler2 state - Empty: " + boiler2.isEmpty() + ", Boiled: " + boiler2.isBoiled());
    }
}