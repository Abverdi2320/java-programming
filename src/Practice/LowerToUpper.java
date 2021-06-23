package Practice;

import java.util.*;
public class LowerToUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Alphabet Z----A ");
        char upper = scan.next().charAt(0);
        char lower = scan.next().charAt(0);

        for(char i = lower; i <= upper; i++){
            System.out.println("i = " + i);

        }
    }
}
