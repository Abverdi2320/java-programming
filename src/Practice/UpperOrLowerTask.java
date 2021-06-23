package Practice;

import java.util.*;
public class UpperOrLowerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Alphabet A-Z ");
        char upper = scan.next().charAt(0);
        char lower = scan.next().charAt(0);

        for (char i = upper; i<= lower; i++){
            System.out.println(i);
        }


    }
}
