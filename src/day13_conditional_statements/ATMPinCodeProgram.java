package day13_conditional_statements;

public class ATMPinCodeProgram {
    public static void main(String[] args) {
        System.err.println("**** WELCOME TO TD BANK ATM****");
        int secretPincode = 1234;
        int inputPincode = 1234;

        if(secretPincode==inputPincode){
            System.out.println("Welcome to your account.");
            System.out.println("You can withdraw, check balance, deposit");
        }else{
            System.out.println("Incorrect pin code!");
            System.out.println("Please try again");
        }
    }
}
