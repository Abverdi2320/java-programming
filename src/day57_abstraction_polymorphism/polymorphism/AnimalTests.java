package day57_abstraction_polymorphism.polymorphism;

import OfficeHours.Practice_06_15_2021.C;

import java.util.ArrayList;
import java.util.List;

public class AnimalTests {
    public static void main(String[] args) {
        Animal a1 = new Animal(); // not polymorphic, data type and object type are SAME
        a1.makeNoise();

        //Polymorphism - polymorphic way
        //parent type = new child type
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Horse();

        animal1.makeNoise();
        animal2.makeNoise();
        animal3.makeNoise();
    //    List list = new ArrayList();

        List<Animal> lisOfAnimals = new ArrayList<>();
        lisOfAnimals.add(new Dog());
        lisOfAnimals.add(new Dog());
        lisOfAnimals.add(new Horse());
        lisOfAnimals.add(new Cat());
        for (Animal each : lisOfAnimals) {
            each.makeNoise();
        }

    }
}
