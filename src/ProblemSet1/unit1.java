package ProblemSet1;

import java.util.*;

public class unit1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ask the user how many people they live with?");
        int people = scan.nextInt();
        if (people < 2) {
            System.out.println("Live with less than 2 people");
        } else if (people >= 3 && people <= 6) {
            System.out.println("Live 3-6 people");
        } else if (people > 6) {
            System.out.println("Live with more than 6 people");
        }
        System.out.println("Ask the user what city they live in");
        String user = scan.next();
        System.out.println("Do you live in downtown?");
        String downtown = scan.next();

        if (downtown.equals("yes")) {
            System.out.println("Have thought about moving to the suburbs?");
            String yesOrNo = scan.next();
            if (yesOrNo.equals("yes")) {
                System.out.println("Do it its great!");
            } else {
                System.out.println("You should think about it");
            }
        }
        System.out.println("What is your favourite animals");
        String animal = scan.next();
        System.out.println("Wow your " +animal+ " great animal");
        System.out.println("How many pet you want");
        int interesting = scan.nextInt();
        System.out.println("Interesting, do you want " +interesting+(animal)+ " s");
    }
}
