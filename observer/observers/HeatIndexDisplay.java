package patterns.observer.observers;

import patterns.observer.subject.WeatherData;

/* A concrete Observer that displays the heat index, calculated based on temperature and humidity.
 * This class observes changes in the WeatherData subject and updates its display accordingly. */
public class HeatIndexDisplay implements Update, DisplayElement {
    float heatIndex = 0.0f;

    // Holds a reference to the WeatherData subject to allow un-registration later if needed.
    private WeatherData weatherData;

    /* Constructor registers this display as an Observer of the provided WeatherData instance.
     * This establishes the observer-subject relationship. */
    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    /* Updates the heat index based on new temperature and humidity values,
     * then displays the updated heat index. */
    public void update(float temp, float humidity, float pressure) {
        heatIndex = computeHeatIndex(temp, humidity);
        display();
    }

    /* Calculates the heat index based on the temperature and humidity values
     * using a complex formula. */
    private float computeHeatIndex(float temperature, float humidity) {
        return (float) (
            16.923 +
                (0.185212 * temperature) +
                (5.37941 * humidity) -
                (0.100254 * temperature * humidity) +
                (0.00941695 * (temperature * temperature)) +
                (0.00728898 * (humidity * humidity)) +
                (0.000345372 * (temperature * temperature * humidity)) -
                (0.000814971 * (temperature * humidity * humidity)) +
                (0.0000102102 * (temperature * temperature * humidity * humidity)) -
                (0.000038646 * (temperature * temperature * temperature)) +
                (0.0000291583 * (humidity * humidity * humidity)) +
                (0.00000142721 * (temperature * temperature * temperature * humidity)) +
                (0.000000197483 * (temperature * humidity * humidity * humidity)) -
                (0.0000000218429 * (temperature * temperature * temperature * humidity * humidity)) +
                (0.000000000843296 * (temperature * temperature * humidity * humidity * humidity)) -
                (0.0000000000481975 * (temperature * temperature * temperature * humidity * humidity * humidity))
        );
    }

    // Displays the current heat index value.
    public void display() {
        System.out.println("Heat index is " + heatIndex);
    }
}
