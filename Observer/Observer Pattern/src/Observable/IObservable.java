package Observable;

import Observer.IObserver;

public interface IObservable {
    public void addObserver(IObserver obs);
    public void removeObserver(IObserver obs);
    public void notifyObserver();
}
