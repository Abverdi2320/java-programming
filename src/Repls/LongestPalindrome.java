package Repls;

import java.util.*;

public class LongestPalindrome {
    public static void main(String[] args) {
        String[] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        System.out.println(longestPalindrome(words));

    }

    public static String longestPalindrome(String[] arr) {

        String index = "";
        String palindrome = "";

        for (int i = 0; i < arr.length; i++) { // outer loop: check all indexes
            boolean isPalindrome = true;

            for (int j = 0; j < arr[i].length() / 2; j++) { // inner loop: check the  length of each index by itself
                index = arr[i];

                if (index.charAt(j) != index.charAt(index.length() - j - 1)) {
                    isPalindrome = false;
                    break;
                }
            }
            if(isPalindrome && index.length()>=palindrome.length()){
                palindrome = index+", ";
            }
        }
        return palindrome;

    }
}
