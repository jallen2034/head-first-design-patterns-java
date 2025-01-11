package patterns.observer.displayFactory.displays.CurrentConditionsDisplay;

import patterns.observer.displayFactory.displays.Display;
import patterns.observer.subject.WeatherData;

public class CurrentConditionsDisplay extends Display {
    // Stores the current temperature and humidity values received from the Subject.
    private float temperature;
    private float humidity;

    // Reference to the Subject in case we want to un-register this observer from the Subject later.
    private WeatherData weatherData;

    /* Constructor registers this display as an Observer of the provided WeatherData
     * instance, establishing the observer-subject relationship. */
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /* Called by the Subject (WeatherData) whenever the state changes. Updates the
     * internal state with the new temperature and humidity. */
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    // Displays the current temperature and humidity to the console.
    public void display() {
        System.out.println("Current Conditions: " + temperature + "F Degrees and " + humidity + "% humidity");
    }
}
