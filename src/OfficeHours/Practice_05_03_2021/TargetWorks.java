package OfficeHours.Practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWorks {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "javascript", "java", "word"));
        String targetWord = "java";

        int count = 0;

        for (String each : words){
            if(words.equals(targetWord)){
                count++;
            }
        }
        System.out.println(targetWord + " was found " +count);
    }
}
