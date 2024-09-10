package patterns.observer.observers;

import patterns.observer.subject.WeatherData;

public class CurrentStatisticsDisplay implements Update, DisplayElement {
    // Tracks the highest, lowest, and average temperature statistics based on recorded readings.
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numberOfTempReadings;

    // Reference to the Subject in case we want to un-register this observer from the Subject later.
    private WeatherData weatherData;

    /* Constructor registers this display as an Observer of the provided WeatherData
     * instance, establishing the observer-subject relationship. */
    public CurrentStatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    // Updates the display with new temperature data from the WeatherData subject.
    public void update(float temperature, float humidity, float pressure) {
        tempSum += temperature;
        numberOfTempReadings++;

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }

        if (temperature < minTemp) {
            minTemp = temperature;
        }

        display();
    }

    // Displays the current temperature and humidity to the console.
    public void display() {
        float avgTemp = tempSum / numberOfTempReadings;
        System.out.println("Avg/Max/Min temperature = " + avgTemp + "/" + maxTemp + "/" + minTemp);
    }
}
