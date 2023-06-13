package DP02WeatherAppObserver.Observer;

import DP02WeatherAppObserver.Display.DisplayElement;
import DP02WeatherAppObserver.Subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.resigterObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature 
        + " F degrees, " + humidity + "% humidity and " + pressure + "atm pressure");
    }
}
