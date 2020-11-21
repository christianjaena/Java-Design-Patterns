package behavioralPatterns.Observer.ObserverExercise;

public interface Subject {
    public void registerObserver(IObserver observer);
    public void removeObserver(IObserver observer);
    public void notifyObservers();
}
