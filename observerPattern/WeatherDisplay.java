public class WeatherDisplay implements Display {
    Data data;

    public WeatherDisplay(Data d) {
        data = d;
    }

    public void display() {
        System.out.println(data.toString());
    }

    public void updateData(Data d) {
        data = d;
    }
}
