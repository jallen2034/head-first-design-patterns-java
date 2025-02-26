package patterns.observer;
import patterns.observer.displayFactory.displays.Display;
import patterns.observer.displayFactory.store.DisplayStore;
import patterns.observer.displayFactory.store.WeatherDisplayFactory;
import patterns.observer.subject.WeatherData;
import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private final WeatherData weatherData;
    private final List<Display> displays;

    public List<Display> createDisplays() {
        // List of display types to create
        List<String> displayTypes = List.of("currentConditions", "statistics", "heatIndex", "dewPoint");

        // List to collect all created displays
        List<Display> displays = new ArrayList<>();
        DisplayStore displayStore = new WeatherDisplayFactory(this.weatherData);

        // Use the factory to create displays dynamically
        for (String type : displayTypes) {
            displays.add(displayStore.orderDisplay(type));
        }

        return displays; // Return the created displays
    }

    /* Creates and returns a list of sample weather readings.
     * This method encapsulates the logic for initializing sample data,
     * ensuring the main program remains clean and focused on orchestration.
     * It also allows for easy extension by modifying or adding new readings here. */
    private static List<WeatherStation.WeatherReading> createReadings() {
        return List.of(
                new WeatherStation.WeatherReading(80, 65, 30.4f),
                new WeatherStation.WeatherReading(82, 70, 29.2f),
                new WeatherStation.WeatherReading(78, 90, 29.2f)
        );
    }

    public WeatherStation() {
        this.weatherData = new WeatherData();

        // Create the displays for the WeatherStation when constructing it in the main runner :)
        this.displays = createDisplays();
    }

    public void recordWeatherData(float temperature, float humidity, float pressure) {
        // Set the measurements for the new temp measurements to the WeatherStation Subject + notify observers of this.
        weatherData.setMeasurements(temperature, humidity, pressure);

        // Then display the results in the observers they just picked up from the subject.
        displayAllReadings();
    }

    private void displayAllReadings() {
        displays.forEach(Display::display);
    }

    // Weather reading record to encapsulate weather data
    public record WeatherReading(float temperature, float humidity, float pressure) {}

    public void recordReadings() {
        List<WeatherStation.WeatherReading> weatherReadings = createReadings();

        weatherReadings.forEach(reading ->
                recordWeatherData(reading.temperature, reading.humidity, reading.pressure)
        );
    }
}