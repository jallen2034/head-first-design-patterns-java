package patterns.observer.subject;

import patterns.observer.observers.Update;
import java.util.ArrayList;
import java.util.List;

/* WeatherData acts as the Subject in the Observer pattern, managing a list
 * of observers and notifying them whenever the weather data changes. */
public class WeatherData implements Subject {
    private List<Update> observers;  // Holds all registered observers.
    private float temperature;
    private float humidity;
    private float pressure;

    // Initializes the list to hold all the observers.
    public WeatherData() {
        observers = new ArrayList<>();
    }

    // Adds a new observer to the list of observers.
    public void registerObserver(Update observer) {
        observers.add(observer);
    }

    // Removes an observer from the list of observers.
    public void removeObserver(Update observer) {
        observers.remove(observer);
    }

    // Notifies all registered observers of any changes to the weather data.
    public void notifyObservers() {
        for (Update observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    // Updates the weather data and triggers notification of observers.
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    // TODO: Additional weather data management methods can be added here.
}
