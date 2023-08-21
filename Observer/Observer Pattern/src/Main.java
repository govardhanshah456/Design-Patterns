import Observable.WeatherStation;
import Observer.Mobile;
import Observer.Tablet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation=new WeatherStation();
        Mobile Iphone=new Mobile(weatherStation);
        Tablet Mac=new Tablet(weatherStation);
        weatherStation.addObserver(Iphone);
        weatherStation.addObserver(Mac);
        Iphone.display();
        Mac.display();
        weatherStation.setTemperature(45.6f);
        Iphone.display();
        Mac.display();
    }
}