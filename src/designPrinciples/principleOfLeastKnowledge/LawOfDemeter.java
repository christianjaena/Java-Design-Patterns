package designPrinciples.principleOfLeastKnowledge;

import state.Canvas;

import java.lang.reflect.Field;

public class LawOfDemeter {
}

/*
    First Rule: a method, M, in an object, O, can call on any other method within O itself.
 */
class O {
    public void M() {
        this.N();
        System.out.println("Method M invoked");
    }

    public void N() {
        System.out.println("Method N invoked");
    }
}

/*
    Second Rule: a method, M, can call the methods of any parameter P.
 */

class Friend {
    public void N() {
        System.out.println("Method N invoked");
    }
}

class O2 {
   public void M(Friend P) {
       P.N();
       System.out.println("Method M invoked");
   }
}

/*
    Third Rule: a method, M, can call a method, N, of an object if I is instantiated within M.
 */

class Friend2 {
    public void N() {
        System.out.println("Method N invoked");
    }
}

class O3 {
    public void M() {
        Friend2 I = new Friend2();
        I.N();
        System.out.println("Method M invoked");
    }
}

/*
    Fourth Rule: any method, M, in object O, can invoke methods of any type of object that is a direct component of O.
 */

class Friend3 {
    public void N() {
        System.out.println("Method N invoked");
    }
}

class O4 {
    public Friend3 I = new Friend3();
    public void M() {
        this.I.N();
        System.out.println("Method M invoked");
    }
}


/*
    BAD PRACTICE: scope and responsibility
 */

class Driver {
//    Car myCar = new Car();

    public void drive() {
        // engine is not a responsibility of Driver class
//        this.myCar.engine.start();
    }
}

/*
    BAD PRACTICE: return objects
 */

class Driver2 {
//    public Car myCar;

    // Motorcycle type should not be instantiated since it is not instatiated within the class
//    public void rentVehicle(VehicleRentalStore store) {
//        Motorcycle myRental = store.rent("motorcycle");
//        myRental.drive();
//    }
}

/*
    Driving a car is just simply starting the engine using keys (Inteface), then the subsequent systems will do its
    own or related task that will make the engine start for you.
 */