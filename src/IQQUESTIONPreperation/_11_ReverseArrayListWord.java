package IQQUESTIONPreperation;

import OfficeHours.Practice_06_21_2021.A;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class _11_ReverseArrayListWord {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("cucumber","bdd","selenium","java"));
        ArrayList<String> reverse = new ArrayList<>();

        for (int i = words.size()-1; i >=0; i--) {
            reverse.add(words.get(i));
        }
        System.out.println("reverse = " + reverse);
    }
}
