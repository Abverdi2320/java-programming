package IQTasks;

import java.util.*;

public class SameLetters {
    public static void main(String[] args) {
        /*
           Write a return method that check if a string is build out of the same letters as another string.

            Ex:  same("abc",  "cab"); -> true
         */
        System.out.println(letters("abcd", "dcab"));

    }

    public static boolean letters(String str1, String str2) {
        char[]ch1 = str1.toCharArray();
        char[]ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String a1 = "";
        String a2 = "";

        for (char each:ch1){
            a1+=each;
        }
        for (char each:ch2){
            a2+=each;
        }
        return a1.equals(a2);

    }
}