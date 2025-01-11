package patterns.observer.subject;
import patterns.observer.displayFactory.displays.Display;
import java.util.ArrayList;
import java.util.List;

/* WeatherData acts as the Subject in the Observer pattern, managing a list
 * of observers and notifying them whenever the weather data changes. */
public class WeatherData {
    private final List<Display> observers;  // Holds all registered observers.
    private float temperature;
    private float humidity;
    private float pressure;

    // Initializes the list to hold all the observers.
    public WeatherData() {
        observers = new ArrayList<>();
    }

    // Adds a new observer to the list of observers.
    public void registerObserver(Display observer) {
        observers.add(observer);
    }


    // Notifies all registered observers of any changes to the weather data.
    public void notifyDisplayObserversOfChange() {
        for (Display observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    // Updates the weather data and triggers notification of observers.
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyDisplayObserversOfChange();
    }
}
