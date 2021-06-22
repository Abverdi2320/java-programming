package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(760);
        checkEligible(815);
        checkEligible(400);
        System.out.println(getCreditScore());
        System.out.println("Credit Score = " +getCreditScore());
        int score = getCreditScore();
        System.out.println("Score = " +score);

    }

    public static void checkEligible(int creditScore){
        if (creditScore>=700){
            System.out.println("You are eligible to buy a car");
        }else{
            System.out.println("Sorry You are not eligible ");
        }
    }

    public static int getCreditScore(){
        return 800;
    }
}

