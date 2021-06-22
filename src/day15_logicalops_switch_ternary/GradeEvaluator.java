package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'A';

        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("Passes with grade " + grade);
        } else if (grade == 'D') {
            System.out.println("Qualify for retake when grade is  " + grade);
        } else if (grade == 'E') {
            System.out.println("Fail when grade is " + grade);
        } else {
            System.out.println("Anything else invalid " + grade);
        }

            grade ='D';
        if (grade == 'A' || grade == 'a' || grade == 'B' || grade == 'b' || grade == 'C' || grade == 'c') {
            System.out.println("Passes with grade " + grade);
        } else if (grade == 'D' || grade == 'd') {
            System.out.println("Qualify for retake when grade is  " + grade);
        } else if (grade == 'E' || grade == 'e') {
            System.out.println("Fail when grade is " + grade);
        } else {
            System.out.println("Anything else invalid " + grade);
        }


        double budget = 5000;

    }
}