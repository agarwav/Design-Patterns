public class WeatherObserver implements Observer {
    private Data wd;
    private Display disp;

    public WeatherObserver(float temp, float pres, float hum, Station ws) {
        wd = new WeatherData(temp, pres, hum);
        disp = new WeatherDisplay(wd);
        ws.registerObserver(this);
    }

    public WeatherObserver(Data wd, Station ws) {
        this.wd = wd;
        disp = new WeatherDisplay(this.wd);
        ws.registerObserver(this);
    }

    public WeatherObserver(Station ws) {
        wd = new WeatherData();
        disp = new WeatherDisplay(wd);
        ws.registerObserver(this);
    }

    public void update(Data d) {
        wd = d;
        disp.updateData(d);
        printInfo();
    }

    public void printInfo() {
        disp.display();
    }
}
