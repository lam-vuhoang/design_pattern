package DP02WeatherAppObserver;

import DP02WeatherAppObserver.Observer.CurrentConditionsDisplay;
import DP02WeatherAppObserver.Subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurement(80, 65, 30.4f);
        weatherData.setMeasurement(82, 70, 29.2f);
        weatherData.setMeasurement(78, 90, 29.2f);
    }
}
