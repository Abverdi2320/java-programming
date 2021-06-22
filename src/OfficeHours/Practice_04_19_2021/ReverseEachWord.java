package OfficeHours.Practice_04_19_2021;

import day38_Methods.StringUtils;

public class ReverseEachWord {
    public static void main(String[] args) {
        System.out.println(reverseEachWord("It started to snow in chicago"));

    }
    public static String reverseEachWord(String str) {
        String reverse = "";
        for (String each : str.split(" ")) {
            reverse += StringUtils.reverse(each)+ " ";
            // Here we would reverse each String with a for loop
            // going from the last index to the first index
        }
        return reverse.trim();
    }
}



