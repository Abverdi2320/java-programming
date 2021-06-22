package day55_abstraction.exercise_example;

public class AtTheGym {
    public static void main(String[] args) {
        Exercise exercise = new Running(); // polymorphism benefit of abstraction. later
        Running running = new Running();
        Swimming swimming = new Swimming();
        FreeWeight freeWeight = new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("exercise.getCalories(30) = " + exercise.getCalories(30));
        System.out.println();

        running.start();
        running.perform();
        System.out.println("running.getCalories(30) = " + running.getCalories(30));

        System.out.println();

        swimming.start();
        swimming.perform();
        System.out.println("swimming.getCalories(30) = " + swimming.getCalories(30));

        System.out.println();

        freeWeight.start();
        freeWeight.perform();
        freeWeight.endLift();
        System.out.println("freeWeight.getCalories(30) = " + freeWeight.getCalories(30));


    }
}
