package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0;
        double salesAmount = 5000;

        if (salesAmount <= 2000) {
            System.err.println("GOOD JOB, YOU QUALIFIED FOR BONUS! ");
            bonus = 50;
        } else {
            System.err.println("Great job, you are qualified for full bonus  ");
            bonus = 100;
        }

        System.out.println("Your total bonus " + bonus);
    }
}
