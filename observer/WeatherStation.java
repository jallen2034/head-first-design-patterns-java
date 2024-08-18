package patterns.observer;

import patterns.observer.observers.CurrentConditionsDisplay;
import patterns.observer.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        // Create a WeatherData object (the Subject).
        WeatherData weatherData = new WeatherData();

        // Create an observer for current conditions and register it with the WeatherData subject.
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        // TODO: Create and register two more observers: StatisticsDisplay and ForecastDisplay.

        // Simulate new weather measurements; the WeatherData subject will notify all registered observers.
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
