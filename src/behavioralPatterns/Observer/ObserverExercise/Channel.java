package behavioralPatterns.Observer.ObserverExercise;

import java.util.ArrayList;

public class Channel {
    private ArrayList<IObserver> observers = new ArrayList<IObserver>();
    private String channelName;
    private String status;

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void notifyObservers() {
        for (IObserver observer: observers) {
            observer.update(getStatus());
        }
    }

    public void registerObserver(IObserver observer) {
       observers.add(observer);
    }

    public void  removeObserver(IObserver observer) {
       observers.remove(observer);
    }

}
