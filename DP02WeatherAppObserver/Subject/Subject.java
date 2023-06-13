package DP02WeatherAppObserver.Subject;

import DP02WeatherAppObserver.Observer.Observer;

public interface Subject {
    public void resigterObserver(Observer o);
    public void removeObserver(Observer o);
    public void notityObservers();
}
