package day62_collections;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer>nums = new ArrayList<>();
        List<String> cities = new ArrayList<>(); //polymorphism
        Collection<String> schools = new ArrayList<>();

        cities.add("NewYork"); //add method from Collection or List interface
        cities.add("Baku");
        cities.add("Springfield");
        System.out.println(cities);
        System.out.println("First city: " + cities.get(1));
        System.out.println("Count if cities = " +cities.size());



    }
}
