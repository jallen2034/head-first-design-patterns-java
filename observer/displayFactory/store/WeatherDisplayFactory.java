package patterns.observer.displayFactory.store;

import patterns.observer.displayFactory.displays.CurrentConditionsDisplay.CurrentConditionsDisplay;
import patterns.observer.displayFactory.displays.CurrentStatisticsDisplay.CurrentStatisticsDisplay;
import patterns.observer.displayFactory.displays.DewPointDisplay.DewPointDisplay;
import patterns.observer.displayFactory.displays.Display;
import patterns.observer.displayFactory.displays.HeatIndextDisplay.HeatIndexDisplay;
import patterns.observer.subject.WeatherData;

public class WeatherDisplayFactory extends DisplayStore {
    private final WeatherData weatherData;

    public WeatherDisplayFactory(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    protected Display createDisplay(String type) {
        return switch (type) {
            case "currentConditions" -> new CurrentConditionsDisplay(weatherData);
            case "statistics" -> new CurrentStatisticsDisplay(weatherData);
            case "heatIndex" -> new HeatIndexDisplay(weatherData);
            case "dewPoint" -> new DewPointDisplay(weatherData);
            default -> null;
        };
    }
}
