package patterns.observer;

import patterns.observer.observers.DisplayElement;
import patterns.observer.subject.WeatherData;
import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private final WeatherData weatherData;
    private final List<DisplayElement> displays;

    public WeatherStation() {
        this.weatherData = new WeatherData();
        this.displays = new ArrayList<>();
    }

    public void addMultipleDisplays(List<DisplayElement> displayElements) {
        displays.addAll(displayElements);
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }

    public void recordWeatherData(float temperature, float humidity, float pressure) {
        // Set the measurements for the new temp measurements to the WeatherStation Subject + notify observers of this.
        weatherData.setMeasurements(temperature, humidity, pressure);

        // Then display the results in the observers they just picked up from the subject.
        displayAllReadings();
    }

    private void displayAllReadings() {
        displays.forEach(DisplayElement::display);
    }

    // Weather reading record to encapsulate weather data
    public record WeatherReading(float temperature, float humidity, float pressure) {}

    public void recordMultipleReadings(List<WeatherReading> readings) {
        readings.forEach(reading ->
                recordWeatherData(reading.temperature, reading.humidity, reading.pressure)
        );
    }
}