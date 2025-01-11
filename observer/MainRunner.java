package patterns.observer;

public class MainRunner {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        station.recordReadings();
    }
}