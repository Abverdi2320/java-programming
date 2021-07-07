package day56_abstraction;

import day56_abstraction.transportation.SelfDrivable;
import day56_abstraction.transportation.Tesla;
import day56_abstraction.transportation.Transportation;

public class DrivableTestObject {
    public static void main(String[] args) {
        Tesla model3 = new Tesla();
        model3.start();
        model3.hi();
        model3.transportPeople();
        model3.autoPiloting();
        model3.cost(25);
        model3.stop();
        model3.bye();

        System.out.println();

        Plane boeing787 = new Plane();
        boeing787.start();
        boeing787.hi();
        boeing787.transportPeople();
        boeing787.autoPiloting();
        boeing787.cost(250);
        boeing787.land();
        boeing787.stop();
        boeing787.bye();

        System.out.println();

        //Polymorphism
        SelfDrivable sd = new Plane();
        SelfDrivable sd2 = new Tesla();

        System.out.println();

        Transportation tp1 = new Plane();
        Transportation tp2 = new Tesla();
    }
}
