package Practice;

import java.util.*;

public class quizz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String guestName = "";
        String nextGuest = "";
        String newGuestName = "";

        do {
            System.out.println("Please enter guest name:");
            guestName = scan.next();
            nextGuest += nextGuest + guestName;
            System.out.println("Do you want to enter new guest name:");
            newGuestName = scan.next();
        }while(newGuestName.equals("yes"));

        System.out.println("Guest's list: " +nextGuest);


        }
    }
