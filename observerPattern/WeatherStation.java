import java.util.ArrayList;

public class WeatherStation implements Station {
    private WeatherData weatherData;
    private ArrayList<Observer> observers;

    public WeatherStation() {
        observers = new ArrayList();
    }

    public void registerObserver(Observer obs) {
        if (null != obs) {
            observers.add(obs);
        }
    }

    public void registerObservers(ArrayList obs) {
        if (null != obs) {
            observers.addAll(obs);
        }
    }

    public void removeObserver(Observer obs) {
        int i = observers.indexOf(obs);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(double temp, double pres, double hum) {
        WeatherData wd = new WeatherData(temp, pres, hum);
        weatherData = wd;
        measurementsChanged();
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(weatherData);
        }
    }
}
