package Practice;


import java.util.*;

public class MinimumAndMaximumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            if (i < num) {
                System.out.println("Minimum Number " +i  );
            }
        }
    }
}
