package behavioralPatterns.Observer.ObserverExercise;

import java.util.ArrayList;

public class Follower implements IObserver {
    private String followerName;
    private ArrayList<String> updates = new ArrayList<String>();

    @Override
    public void update(String update) {
       updates.add(update);
    }

    public void play() {
        System.out.println("Playing: " + updates.get(updates.size() - 1));
    }
}
