package Practice;

import java.util.Scanner;

public class practice6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Check account number");
        String accountNumber = scan.next();

        if (accountNumber.startsWith("2")) {
            if (accountNumber.length() == 7) {
                System.out.println("Valid 7 digit account number");
            } else {
                System.out.println("Invalid 7 digit account number");
            }
        } else if (accountNumber.startsWith("5")) {
            if (accountNumber.length() == 10) {
                System.out.println("Valid 5 digit account number");
            } else {
                System.out.println("Invalid 5 digit account number");
            }
            System.out.println("Invalid account number");
        }
    }
}
