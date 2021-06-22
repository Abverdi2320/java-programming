package day55_abstraction.exercise_example;

import day55_abstraction.exercise_example.Exercise;

public class Running extends Exercise {
    @Override
    public void perform() {
        System.out.println("Performing Running exercise");

    }

    /**
     *
     * @param minutes - how long is exercise is performed
     * @return we are assuming average num of calories while running is 13
     */

    @Override
    public int getCalories(int minutes) {
        return minutes * 13;
    }
}
