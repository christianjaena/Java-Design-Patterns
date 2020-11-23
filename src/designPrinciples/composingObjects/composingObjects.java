package designPrinciples.composingObjects;

import java.util.ArrayList;

public class composingObjects {
}

/*
 An instance of Student class can be composed of instances of any class that implements
 the Person Interface, including itself.
 */
interface Person {
    public void eat();
    public void sleep();
    public void walk();
}

class Student implements Person {
    private ArrayList<Person> people;

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void walk() {

    }
}

class Teacher implements Person {

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void walk() {

    }
}

/*
 An instance of Dog class can be composed of instances of any class that implements the Animal interface.
 */

interface Animal {
    public void eat();
    public void sleep();
    public void walk();
}

class Dog {
    private ArrayList<Animal> animals;

    public Dog(ArrayList<Animal> animal) {}
}

class Cat implements Animal {

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void walk() {

    }
}
