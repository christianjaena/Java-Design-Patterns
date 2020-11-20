package behavioralPatterns.State.StateExercise;

public class StateExercise {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.getState();
        p1.doTask("bball");
        p1.getState();
    }
}

class PlayingBasketball {
    public void play(Person person) {
        person.setState("Playing BBall");
    }
}

class Person {
    private String state = "no state";
    private PlayingBasketball bball;

    public void doTask(String task) {
        switch (task) {
            case "bball":
                bball = new PlayingBasketball();
                bball.play(this);
                break;
            default:
                System.out.println("No State");
                break;
        }
    }

    public void setState(String state) {
        this.state = state;
    }

    public void getState() {
        System.out.println(this.state);
    }
}
