package day55_abstraction.exercise_example;

public abstract class Exercise {
    public void start(){ //non-abstract method
        System.out.println("Warming up and starting the exercise");
    }

    /**
     * -abstract method - method without body, just signature
     * -purpose: letting sub classes implement/override their own way
     *
     */
    public  abstract  void  perform();

    /**
     *
     * @return number of calories burned/used
     */

    public abstract int getCalories(int minutes);
}
