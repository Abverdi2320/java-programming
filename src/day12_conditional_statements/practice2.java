package day12_conditional_statements;

import java.util.Scanner;
public class practice2 {
         public static void main(String[] args){
             Scanner input = new Scanner(System.in);
             System.err.println("********* WELCOME TO SHOKO **********");
             System.err.println("NOT ALLOWED TO AGE UNDER 21!");
             System.err.println("ENTER YOUR AGE:");
             int yourAge = input.nextInt();
             if(yourAge>=21){
                 System.err.println("You can go to nightclubs if you are more or equal to " +yourAge);
             }else {
                 System.err.println("You cant go to nightclubs if you are less than " +yourAge);
             }

         }
    }
