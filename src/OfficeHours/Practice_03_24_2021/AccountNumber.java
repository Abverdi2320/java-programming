package OfficeHours.Practice_03_24_2021;

public class AccountNumber{
    public static void main(String[] args) {
        String accountNumber = "500000";

        if(accountNumber.startsWith("2")){

            if(accountNumber.length()==7){
                System.out.println("Valid 7 digit account number");
            }else{
                System.out.println("Invalid 7 digit number");
            }

        }else if(accountNumber.startsWith("5")){

            if(accountNumber.length()==10){
                System.out.println("Valid 10 digit account number");
            }else{
                System.out.println("Invalid 10 digit number");
            }

        }else{
            System.out.println("Invalid account number");
        }
    }
}

