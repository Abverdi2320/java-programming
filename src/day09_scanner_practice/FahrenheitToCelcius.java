package day09_scanner_practice;

import java.util.Scanner;
public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("CALCULATION:");
        int p1 = scan.nextInt() ;
        int p2 = p1 / 50;
        int remaining = p1 % 100;
        System.out.println("p1 = "+ p1);
        System.out.println("p2 = "+ p2);
        System.out.println("remaining = "+remaining );


    }
}
