package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double balance = 345.55;
        double d1 = 20.88;
        double d2 = 129.99;
        double d3 = 14.99;
        double remainingBalance = balance  - (d1 + d2 + d3);

        System.out.println("Your initial balance: " + balance  );
        System.out.println("Your spending balance: " + (d1 + d2 + d3));
        System.out.println("Your remaining balance: " + remainingBalance );


        int balance1 = (int) remainingBalance ;
        System.out.println( " Your remaining balance is: " + balance1 );


        byte num1 = 10;
        short num2 = num1;
        System.out.println( );



    }
}
