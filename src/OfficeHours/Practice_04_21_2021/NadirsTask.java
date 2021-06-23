package OfficeHours.Practice_04_21_2021;

import java.util.Arrays;

public class NadirsTask {
    public static void main(String[] args) {
        System.out.println(lastThree("javabc"));

    }

    public static String lastThree(String word) {
        String character = "";
         for(int i = 0; i<word.length()/2; i++){
            character+=word.charAt(i);
         }
         return word;
    }
}
