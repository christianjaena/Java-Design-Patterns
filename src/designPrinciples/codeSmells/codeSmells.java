package designPrinciples.codeSmells;

public class codeSmells {
}

//** Long comments.  **//

/*
......................
 */

class LongComments {
    // complex implementations
}

// Long methods

class LongMethods {
    public void longMethod() {
       /*
        long implementation
        */
    }
}

//** Large classes **//

class LargeClass {
    /*
    many behaviors and attributes
     */
}

//** Data Classes **//

class DataClass {
    // Unnecessary class for name with getters and setters.
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//** Data Clumps **//

class DataClumps {
    // Make a Coordinate object instead.
   public void method(int x, int y, int z)  { }
}

//** Long Parameters **//

class LongParameters {
    // Shorten the parameters.
    public void longParams(String a, String b, int c, int d, float e, float f, double g, double h) {}
}

//**  Divergent Change **//

class DivergentChange {
    public void divergentChangeMethod(String args) {
        // calls methods from other class passing the parameter making the method hard to refactor due to many changes.
    }
}

//** Shotgun Surgery **//

class ShotgunSurgery {
    public void shotgunSurgeryMethod() {
        // running this method would affect other classes and methods.
    }
}


//** Feature Envy **//

class FeatureEnvy {
    public void featureEnvyMethod() {
        // frequent calls on one object that need to be together
    }
}

//** Inappropriate Intimacy **//

class InappropriateIntimacy {
   public void inappropriateIntimacyMethod() {
       // tight coupling with one object
   }
}

//** Message Chains **//

class MessageChains {
    public void messageChainMethod() {
        // call this method that will call another method and so on...
    }
}

//** Primitive Obsession **//

class PrimitiveObsession {
   public void primitiveObsession() {
       // using a lot of primitive types instead of using abstract types.
   }
}

//** Switch Statements **//

class SwitchStatements {
    public void switchStatements(String type) {
        // Don't use switch in this case. Should've separated it into a separate object.
       switch (type) {
           case "A":
               System.out.println("A");
               break;
           default:
               System.out.println("default");
               break;
       }
    }
}


//** Speculative Generality **//

class SpeculativeGenerality {
   // Might use this in the future hmmm
}

//** Refused Bequest **//

abstract class ALotOfBehaviors {}

class RefusedBequest extends ALotOfBehaviors{
    // maybe used just one out of 10 behaviors inherited.
}