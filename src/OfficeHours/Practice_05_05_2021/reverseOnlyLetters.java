package OfficeHours.Practice_05_05_2021;

import java.util.*;

public class reverseOnlyLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverseNoSpec("Ab,c,de!$"));


    }
    public static String reverseNoSpec(String str){
        char[]letters = str.toCharArray();
        System.out.println(Arrays.toString(letters));

        for (int i=0, j=letters.length-1; i< letters.length/2; i++){
            if (Character.isLetter(letters[i])){
                for (; j>=0; j--){
                    if (Character.isLetter(letters[j])){
                        char temp = letters[i];
                        letters[i]=letters[j];
                        letters[j--]=temp;
                        break;
                    }
                }
            }
        }
        return String.valueOf(letters);

    }
}
