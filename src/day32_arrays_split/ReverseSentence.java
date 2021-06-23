package day32_arrays_split;

import java.util.*;

public class ReverseSentence {
    public static void main(String[] args) {
        String word = "java is fun";
        String [] reverse = word.split(" ");
        String reversed = "";
        for(int i = reverse.length-1; i>=0; i--){
           // System.out.print(reverse[i]+" ");
            reversed += reverse[i]+ " ";
        }

        System.out.println("Sentence = " +word);
        System.out.println("Reversed = " + reversed.trim());


        String let = "java";
        char [] letters = let.toCharArray();
        System.out.println();
        for(char l :letters){
            System.out.println(l);
        }


    }
}

