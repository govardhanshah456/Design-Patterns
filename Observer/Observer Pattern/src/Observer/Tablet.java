package Observer;

import Observable.WeatherStation;

public class Tablet implements IObserver{
    float temperature;
    private WeatherStation weatherStation;
    public Tablet(WeatherStation weatherStation){
        this.weatherStation=weatherStation;
    }
    public void update(){
        this.temperature=weatherStation.getTemperature();
    }
    public void display(){
        System.out.println("Temperature on Tablet:"+this.temperature);
    }
}
