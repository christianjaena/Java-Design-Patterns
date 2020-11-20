package structuralPatterns.Composite;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;

public class Composite {
    public static void main(String[] args) {
        Housing building = new Housing("123 Street");
        Housing floor1 = new Housing("123 Street - First Floor");
        int firstFloor = building.addStructure(floor1);

        GenericRoom washroom1m = new GenericRoom("1F Men's Washroom");
        GenericRoom washroom1w = new GenericRoom("1F Women's Washroom");
        GenericRoom common1 = new GenericRoom("1F Common Area");

        int firstMens = floor1.addStructure(washroom1m);
        int firstWomens = floor1.addStructure(washroom1m);
        int firstCommon = floor1.addStructure(common1);

        building.enter();
//        Housing currentFloor = building.getStructure(firstFloor);
//        currentFloor.enter();
//        GenericRoom currentRoom = currentFloor.getStructure(firstMens);
//        currentRoom.enter();
//        currentRoom = currentFloor.getStructure(firstCommon);
//        currentRoom.enter();
    }
}

// Step 1: Design the interface that defines the overall type.
interface IStructure {
    public void enter();
    public void exit();
    public void location();
    public String getName();
}

// Step 2: Implement the composite class
class Housing implements IStructure {
    private ArrayList<IStructure> structures;
    private String address;

    public Housing(String address) {
       this.structures = new ArrayList<IStructure>();
       this.address = address;
    }

    @Override
    public void enter() {
        System.out.println("Entering the building");
    }

    @Override
    public void exit() {
        System.out.println("Exiting the building");
    }

    @Override
    public void location() {
        System.out.println("You are currently in " + this.getName() + ". It has ");
        for (IStructure struct : this.structures)
            System.out.println(struct.getName());
    }

    @Override
    public String getName() {
        return this.address;
    }

    public int addStructure(IStructure component) {
        this.structures.add(component);
        return this.structures.size() - 1;
    }

    public IStructure getStructure(int componentNumber) {
        return this.structures.get(componentNumber);
    }
}

// Step 3: Implement the leaf class.
abstract class Room implements IStructure {
    public String name;

    public void enter() {
        System.out.println("You have entered the " + this.name);
    }

    public void exit() {
        System.out.println("You have left the " + this.name);
    }

    public void location() {
        System.out.println("You are currently in the " + this.name);
    }

    public String getName() {
        return this.name;
    }
}

class GenericRoom extends Room {
    public String name;

    public GenericRoom(String name) {
        this.name = name;
    }
}