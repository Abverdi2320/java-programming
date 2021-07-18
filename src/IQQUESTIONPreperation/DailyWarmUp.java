package IQQUESTIONPreperation;


import OfficeHours.Practice_06_21_2021.A;

import java.util.ArrayList;
import java.util.Arrays;

/*
fibo
removerextraspace
reversesecondword
find uniqe
losgestpalindrome
removeduble
 */

public class DailyWarmUp {
    public static void main(String[] args) {
        System.out.println(setUp(8));
        String sentence = "I    LOVEEE    YOU";
        String[] splitSentence = sentence.trim().split(" ");
        System.out.println(setUp2(splitSentence));

        String sentence2 = "I went to shopping";
        String[] splitSentence2 = sentence2.split(" ");
        System.out.println(setup3(splitSentence2));

        System.out.println(setUp4("AAAABBBCCDDDEEEP"));

        String pals[] = {"civic", "bob", "malayalam"};
        System.out.println(setUp5(pals));

        System.out.println(setup6("AAAAABBBBCCCCCDDDD"));


    }

    public static String setUp(int num) {
        int[] arr = new int[num + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return Arrays.toString(arr);
    }

    public static String setUp2(String[] word) {
        String result = "";

        for (String each : word) {
            if (!each.isEmpty()) {
                result += each + " ";
            }
        }
        return result;
    }


    public static String setup3(String[] words) {
        String reverse = "";

        for (int i = words[2].length() - 1; i >= 0; i--) {
            reverse += words[2].charAt(i);
        }
        words[2] = reverse;
        String result = "";

        for (String each : words) {
            result += each + " ";
        }
        return result;
    }


    public static String setUp4(String word) {
        String unique = "";
        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                unique += word.charAt(i);
            }
        }
        return unique;
    }


    public static String setUp5(String[] word) {
        String longestPalindrome = "";

        for (String each : word) {
            for (int i = 0; i < each.length() / 2; i++) {
                if (each.charAt(i) != each.charAt(each.length() - 1 - i)) {

                }
            }
            if (each.length() > longestPalindrome.length()) {
                longestPalindrome = each;
            }

        }
        return longestPalindrome;
    }


    public static String setup6(String dups) {
        String removeDups = "";
        for (int i = 0; i < dups.length(); i++) {
            if (!removeDups.contains(dups.charAt(i) + "")) {
                removeDups += dups.charAt(i);
            }
        }
        return removeDups;
    }
}