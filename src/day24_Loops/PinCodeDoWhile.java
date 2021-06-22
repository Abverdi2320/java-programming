package day24_Loops;

import java.util.*;
public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretPinCode = 1234;
        int pinCode; // declare here so that visible for while condition
        do{
            System.out.print("Enter pin code ");
            pinCode= scan.nextInt();
        }while(pinCode != secretPinCode );
        System.out.println("welcome");

    }
}
