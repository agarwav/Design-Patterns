public class WeatherSystem {
    public static void main(String args[]) {
       WeatherStation ws = new WeatherStation();
       WeatherObserver obs = new WeatherObserver(ws);
       obs.printInfo();
       ws.setMeasurements(273, 2, 1);
       ws.setMeasurements(280, 3, 8);
    }
}
