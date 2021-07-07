package day56_abstraction;

import day56_abstraction.greeting.Greeting;
import day56_abstraction.transportation.SelfDrivable;
import day56_abstraction.transportation.Transportation;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void hi() {
        System.out.println("Welcome to board");

    }

    @Override
    public void bye() {
        System.out.println("Thanks for flying with us");

    }

    @Override
    public void autoPiloting() {
        System.out.println("Flying on auto-pilot mode");

    }

    @Override
    public void transportPeople() {
        System.out.println("Flying people frome one city to another");

    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane costs " +(mile *25.0) + " to fly " + mile + " miles");

    }

    public void land() {
        System.out.println("Plane lands smoothly ");
    }
}
