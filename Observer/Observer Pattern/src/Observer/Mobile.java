package Observer;

import Observable.IObservable;
import Observable.WeatherStation;

public class Mobile implements IObserver{
    float temperature;
    private WeatherStation weatherStation;
    public Mobile(WeatherStation weatherStation){
        this.weatherStation=weatherStation;
    }
    public void update(){
        this.temperature=weatherStation.getTemperature();
    }
    public void display(){
        System.out.println("Temperature on Mobile:"+this.temperature);
    }
}
