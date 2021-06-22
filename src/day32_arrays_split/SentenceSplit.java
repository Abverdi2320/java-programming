package day32_arrays_split;

import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split("");
        System.out.println("1 st word = " +words[0]);
        System.out.println("2 st word = " +words[1]);
        System.out.println("3 st word = " +words[2]);

        for(String each:words){
            System.out.println("each = " + each);
        }



        String googleResult = ("About 1,810,000 results (0.68 seconds");
        String[]arr = googleResult.split(" ");
        System.out.println("count" + arr[1]);
        System.out.println("Seconds = " +arr[3].replace("(",""));


















    }
}
