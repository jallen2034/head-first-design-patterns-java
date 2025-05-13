package patterns.StaticVsNonStatic;

public class CarRegistryStaticExample {
    // Static field - single copy that is used across the entire program.
    public static int totalCarsProduced = 0;

    // Static method to track global car production.
    public static void registerNewCar(String colour) {
        totalCarsProduced++;
        System.out.println("New " + colour + " produced. Total cars: " + totalCarsProduced);
    }
}
