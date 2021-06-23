package day04_variables_intro;

import java.util.Scanner;
public class Conversation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value:" );
        int rent= scan.nextInt() ;
        scan.nextLine() ;
        String weather = " weather is very nice";
        System.out.println("Rent = "+rent );
        System.out.println("Weather = "+weather );


    }
}
