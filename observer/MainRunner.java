package patterns.observer;

import patterns.observer.observers.*;

import java.util.List;

public class MainRunner {

    /* Creates and returns a list of display elements for the WeatherStation.
     * This method adheres to the Open/Closed Principle (O) by allowing new types of displays
     * to be added without modifying the core logic of the WeatherStationDemo class.
     * It also follows the Single Responsibility Principle (SRP) by encapsulating the logic
     * for creating displays in a dedicated method, enhancing readability and maintainability. */
    private static List<DisplayElement> createDisplays(WeatherStation station) {
        return List.of(
                new CurrentConditionsDisplay(station.getWeatherData()),
                new CurrentStatisticsDisplay(station.getWeatherData()),
                new HeatIndexDisplay(station.getWeatherData()),
                new DewPointDisplay(station.getWeatherData())
        );
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

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        List<DisplayElement> displays = createDisplays(station);
        List<WeatherStation.WeatherReading> weatherReadings = createReadings();

        station.addMultipleDisplays(displays);
        station.recordMultipleReadings(weatherReadings);
    }
}