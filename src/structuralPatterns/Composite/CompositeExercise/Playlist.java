package structuralPatterns.Composite.CompositeExercise;

import java.util.ArrayList;

public class Playlist implements IComponent {
    public String playlistName;
    public ArrayList<IComponent> playlist;

    public Playlist(String playlistName) {
        playlist = new ArrayList<IComponent>();
        this.playlistName = playlistName;
    }

    @Override
    public void play() {
        System.out.println("Playing.");
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        System.out.println("Setting speed to " + speed);
    }

    @Override
    public String getName() {
        return this.playlistName;
    }

    public void add(IComponent component) {
       this.playlist.add(component);
    }

    public void remove(IComponent component) {
        this.playlist.remove(component);
    }
}
