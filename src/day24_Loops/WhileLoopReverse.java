package day24_Loops;

public class WhileLoopReverse {
    public static void main(String[] args) {
        int count = 5;
        while (count >= 0) {
            System.out.println("Reversed " + count);
            count--;
        }

        System.out.println("Finish the count");


        int unreadSMS = 10;
        while (unreadSMS > 0) {
            System.out.println("Messages to read " + unreadSMS);
            unreadSMS--;
        }

        System.out.println("No messages to read");
    }
}
