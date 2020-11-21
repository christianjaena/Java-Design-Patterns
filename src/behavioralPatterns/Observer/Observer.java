package behavioralPatterns.Observer;

import java.util.ArrayList;

//public class Observer {
//
//}
//
//class Subject {
//    private ArrayList<Observer> observers = new ArrayList<Observer>();
//
//    public void registerObserver(Observer observer) {
//        observers.add(observer);
//    }
//
//    public void unregisterObserver(Observer observer) {
//        observers.remove(observer);
//    }
//
//    public void notify() {
//        for (Observer o: observers) {
//            o.update();
//        }
//    }
//}
//
//class Blog extends Subject {
//    private String state;
//
//    public String getState() {
//        return state;
//    }
//}
//
//interface IObserver {
//    public void update();
//}
//
//class Subscriber implements  IObserver {
//    @Override
//    public void update() {
//
//    }
//}