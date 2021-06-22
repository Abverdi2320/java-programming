package day24_Loops;
import java.util.*;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int secretNumber = random.nextInt(100);
        int guessingNumber;
        do {
            System.out.println("Guess the secret number");
            guessingNumber = scan.nextInt();
            if(guessingNumber>secretNumber){
                System.out.println("wrong your number is too large");
            }else if(guessingNumber<secretNumber){
                System.out.println("wrong your number is too small");
            }
        }while(secretNumber != guessingNumber);

        System.out.println("You won secret number " +secretNumber);
    }
}