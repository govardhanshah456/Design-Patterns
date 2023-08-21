package Observable;

import Observer.IObserver;

import java.util.ArrayList;

public class WeatherStation  implements IObservable{
    private float temperature;
    private ArrayList<IObserver> observer;
    public WeatherStation(){
        observer=new ArrayList<IObserver>();
    }
    @Override
    public void addObserver(IObserver obs) {
        observer.add(obs);
    }

    @Override
    public void removeObserver(IObserver obs) {
        observer.remove(obs);
    }

    @Override
    public void notifyObserver() {
        observer.forEach(IObserver::update);
    }
    public float getTemperature(){
        return this.temperature;
    }
    public void setTemperature(float temperature){
        this.temperature=temperature;
        notifyObserver();
    }
}
