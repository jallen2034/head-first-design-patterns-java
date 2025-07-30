package patterns.StaticVsNonStatic;

public class StaticVsNonStatic {
    public void launchCars(CarObjectExample[] cars) {
        System.out.println("\n=== LAUNCHING CARS ===");
        for (CarObjectExample car : cars) {
            // Print state before acceleration.
            System.out.println("Before: " + car.getColor() + " car speed: " + car.getSpeed());

            double randomNumber = Math.random() * 100;
            car.accelerate((int)randomNumber);

            // Print state after acceleration.
            System.out.println("After:  " + car.getColor() + " car speed: " + car.getSpeed() +
                    " (accelerated by " + (int)randomNumber + ")");
            System.out.println("-------");
        }
    }

    public void printCarDetails(CarObjectExample[] cars) {
        System.out.println("\n=== CAR OBJECTS IN MEMORY ===");
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car #" + (i+1) + ":");
            System.out.println("  Memory address: " + cars[i].toString());
            System.out.println("  Color: " + cars[i].getColor());
            System.out.println("  Speed: " + cars[i].getSpeed());
            System.out.println("-------");
        }
    }

    public void printRegistryState() {
        System.out.println("\n=== CAR REGISTRY STATE ===");
        System.out.println("Total cars produced: " + CarRegistryStaticExample.totalCarsProduced);
        System.out.println("-------");
    }

    // This is a non-static method that will be called from the static main method.
    public void runProgram() {
        System.out.println("=== STARTING PROGRAM ===");
        // Print initial registry state
        printRegistryState();

        // Array storing multiple car colours that can be used.
        String[] carColors = {"Red", "Blue", "Black", "White", "Silver", "Gray", "Green", "Yellow", "Orange", "Brown"};

        // Create an array to hold the car objects.
        CarObjectExample[] cars = new CarObjectExample[carColors.length];

        // Initialize each car with a different color.
        // Create a new car with initial speed 0 and the color from the array.
        System.out.println("\n=== CREATING CAR OBJECTS ===");
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new CarObjectExample(0, carColors[i]);
            System.out.println("Created " + carColors[i] + " car at memory address: " + cars[i].toString());
        }

        // Print car objects after creation.
        printCarDetails(cars);

        // Usage of modifying the launch speed of multiple objects into the heap of different car types.
        this.launchCars(cars);

        // Print car details after acceleration.
        printCarDetails(cars);

        System.out.println("\n=== REGISTERING CARS ===");

        for (int i = 0; i < cars.length; i++) {
            // Before registration.
            System.out.println("Before registering " + cars[i].getColor() +
                    " car - Total registered: " + CarRegistryStaticExample.totalCarsProduced);

            CarRegistryStaticExample.registerNewCar(cars[i].getColor());

            // After registration.
            System.out.println("After registering " + cars[i].getColor() +
                    " car - Total registered: " + CarRegistryStaticExample.totalCarsProduced);
            System.out.println("-------");
        }

        // Print final registry state
        printRegistryState();

        System.out.println("\n=== PROGRAM COMPLETE ===");
    }

    // The correct main method signature - must be public static void.
    public static void main(String[] args) {
        StaticVsNonStatic program = new StaticVsNonStatic();
        program.runProgram();
    }
}