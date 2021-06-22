package OfficeHours.Practice_04_13_2021;

import java.util.*;
public class SmallestAndLongestWordFromArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many words will you enter: ");
        String[]words = new String[scan.nextInt()];
        scan.nextLine();

        for(int i = 0; i< words.length; i++){
            System.out.println("Enter word: " +(i+1));
            words[i]=scan.nextLine();
        }
        System.out.println(Arrays.toString(words));


        String [] smallAndLarge = {words[0],words[0] };
        // 0 -> smallest
        //1 -> largest
        for(String eachWord: words){
            if(eachWord.length()<smallAndLarge[0].length()){
                smallAndLarge[0]=eachWord;
            }
            if (eachWord.length()> smallAndLarge[1].length()){
                smallAndLarge[1]=eachWord;
            }
        }

        System.out.println("smallAndLarge = " + smallAndLarge[0]);
        System.out.println("smallAndLarge = " + smallAndLarge[1]);

    }
}
