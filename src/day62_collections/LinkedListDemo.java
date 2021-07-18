package day62_collections;

import java.util.*;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //LinkedList
        LinkedList<String> friends= new LinkedList();

        //polymorphism
        List<Integer> scores = new LinkedList<>();
        scores.add(10);
        scores.add(15);
        scores.add(20);
        scores.add(20);
        System.out.println("scores = " + scores.get(0));
        System.out.println("scores = " + scores.size());

        friends.add("Abbas");
        friends.add("Elvin");
        friends.add("Emin");
        friends.addFirst("Tosu");

        System.out.println("friends = " + friends);
        System.out.println("friends = " + friends.getFirst());
        System.out.println("friends = " + friends.getLast());

    }
}
