package patterns.observer.displayFactory.displays.DewPointDisplay;

import patterns.observer.displayFactory.displays.Display;
import patterns.observer.subject.WeatherData;

public class DewPointDisplay extends Display {
    private float dewPoint = 0.0f;  // Stores the current dew point value

    // Holds a reference to the WeatherData subject, allowing un-registration if needed
    private WeatherData weatherData;

    /* Constructor that registers this DewPointDisplay instance as an observer of the provided WeatherData instance.
     * The observer-subject relationship is established here, and updates will be received whenever weather data changes. */
    public DewPointDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);  // Register this object as an observer of WeatherData
    }

    /* The update method is called by the WeatherData subject when new data is available.
     * It recalculates the dew point based on the new temperature and humidity values. */
    public void update(float temp, float humidity, float pressure) {
        dewPoint = computeDewPoint(humidity, temp);  // Recalculate the dew point based on new data
    }

    /* This method calculates the dew point using the Magnus formula. It first converts the temperature to Celsius,
     * then computes the dew point, and finally converts the result back to Fahrenheit. */
    private float computeDewPoint(float humidity, float temp) {
        // Convert temperature from Fahrenheit to Celsius
        float tempC = (temp - 32) / 1.8f;

        // Constants for the Magnus formula
        float a = 17.27f;
        float b = 237.7f;

        // Calculate the dew point in Celsius using the Magnus formula
        float alpha = (a * tempC) / (b + tempC) + (float) Math.log(humidity / 100.0);
        float dewPointC = (b * alpha) / (a - alpha);

        // Convert the calculated dew point back to Fahrenheit
        return (dewPointC * 1.8f) + 32;
    }

    /* Displays the current dew point to the console.
     * This method formats the dew point value for user-friendly output. */
    public void display() {
        System.out.println("Dew point display is: " + dewPoint);  // Output the dew point to the console
    }
}
