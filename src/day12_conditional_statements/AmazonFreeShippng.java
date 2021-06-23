package day12_conditional_statements;

import java.util.Scanner;
public class AmazonFreeShippng {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total price:");
        double totalPrice = scan.nextDouble();
        if(totalPrice>=25){
            System.out.println("Free shipping eligible. Your order total $" +totalPrice);
        }else{
            System.out.println("Not eligible for free shipping. order is less than $" + totalPrice);
        }

        System.out.println("THANKS FOR SHOPPING AMAZON!");


    }
}
