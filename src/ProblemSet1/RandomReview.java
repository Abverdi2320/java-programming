package ProblemSet1;

import java.util.*;

public class RandomReview {
    public static void main(String[] args) {
        /*
        Generate a random number that is six digits
        long. Each digit in this number should be unique,
        meaning the number 6 digit number should have 6 different
         character numbers that make it up. Print the number.HINTS: Loops, Strings, Random
         */

        String str = "";
        Random random = new Random();
        String password = "";
        for (int i = 1; i <= 6; i++) {
            int num = random.nextInt(30);
            password+=str.charAt(num);
        }
        System.out.print("password = " + password);

    }
}
