package memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorStatus> states = new ArrayList<>();

    public void push(EditorStatus state) {
        states.add(state);
    }

    public EditorStatus pop() {
        var lastIndex = states.size() - 1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);

        return lastState;
    }
}
