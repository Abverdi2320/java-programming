package OfficeHours.Practice_03_10_2021;

import java.util.Scanner;

public class MovieDuration {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the movie:");
        double movieLength = scan.nextDouble();


        if (movieLength == 1.0) {
            System.out.println("Price: " + 8.99);
        }

        if (movieLength == 1.5) {
            System.out.println("Price: " + 10.50);
        }

        if (movieLength == 2.0) {
            System.out.println("Price: " + 12.99);
        }

        if (movieLength == 2.5) {
            System.out.println("Price: " + 14.50);
        }

        if (movieLength >= 3.0) {
            System.out.println("Price " + 15.99);
        }

    }
}
