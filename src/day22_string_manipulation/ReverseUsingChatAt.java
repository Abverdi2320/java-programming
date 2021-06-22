package day22_string_manipulation;

import java.lang.*; // Added by default

public class ReverseUsingChatAt {
    public static void main(String[] args) {
        String word = "Anna";
        System.out.println(""+word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0));
        System.out.println(word);

        String reversed =  (""+word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0));


        System.out.println("word = " + word);
        System.out.println("reversed = " + reversed);

        if(word.equalsIgnoreCase(reversed)){
            System.out.println("Palindrome word");
        }else{
            System.out.println("Not palindrome");
        }


        
    }
}
