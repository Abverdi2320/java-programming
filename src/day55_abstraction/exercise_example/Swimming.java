package day55_abstraction.exercise_example;

import day55_abstraction.exercise_example.Exercise;

public class Swimming extends Exercise {
    @Override
    public void perform() {
        System.out.println("Swimming exercise perfomming");
    }

    @Override
    public int getCalories(int minutes) {
        return minutes*11;
    }
}
