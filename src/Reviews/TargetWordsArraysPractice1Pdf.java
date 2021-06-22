package Reviews;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TargetWordsArraysPractice1Pdf {
    public static void main(String[] args) {
        /*
        Given an ArrayList of Strings and a target word
        (String) print how many times the target word is in the ArrayList
         */

        ArrayList<String> targetWord = new ArrayList<>(Arrays.asList("java", "html", "css", "java","java", "javascript", "selenium"));
        String any = "";
        int count = 0;
        ArrayList<String>ll= new ArrayList<>();

        for (String each : targetWord) {
            if (each.length()<=5){
                ll.add(each);
            }
        }
        System.out.println(ll);


    }

}