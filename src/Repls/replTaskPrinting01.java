package Repls;

import java.util.*;

public class replTaskPrinting01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        String Math = scan.next();
        double grade1 = scan.nextDouble();
        System.out.println("Please enter subject name number 2 and score for this subject");
        String Biology = scan.next();
        double grade2 = scan.nextDouble();
        System.out.println("Please enter subject name number 3 and score for this subject");
        String English = scan.next();
        double grade3 = scan.nextDouble();
        System.out.println("Please enter subject name number 4 and score for this subject");
        String Chemistry = scan.next();
        double grade4 = scan.nextDouble();
        System.out.println("Please enter subject name number 5 and score for this subject");
        String Music = scan.next();
        double grade5 = scan.nextDouble();
        double averageGrade = scan.nextDouble();
        System.out.println("Summary:" +Math+" - " +grade1+"," + Biology+ " - " +grade2+"," +English+
                " - " +grade3+"," + Chemistry+ " - " + grade4+"," + Music+ " - " + grade5+ "\nYour average score is: " +averageGrade+ "\nThank you for using Grader! \nGoodbye!"  );



    }
}
