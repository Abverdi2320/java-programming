package OfficeHours.Practice_05_11_2021;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SeparatePartsChallenge2 {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character>list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        ArrayList<Character>letters = new ArrayList<>(list);
        ArrayList<Character>digits = new ArrayList<>(list);
        ArrayList<Character>special = new ArrayList<>(list);
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("special = " + special);

        letters.removeIf(eachChar -> !Character.isLetter(eachChar));
        digits.removeIf(eachChar -> !Character.isDigit(eachChar));
        digits.removeIf(eachChar -> !Character.isDigit(eachChar)||Character.isLetter(eachChar));

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("special = " + special);
    }
}
