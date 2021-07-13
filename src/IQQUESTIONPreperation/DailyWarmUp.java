package IQQUESTIONPreperation;


import OfficeHours.Practice_06_21_2021.A;

import java.util.ArrayList;
import java.util.Arrays;

public class DailyWarmUp {
    public static void main(String[] args) {
        String sentence = "I love java";
        String splitSentence[] = sentence.split(" ");
        System.out.println(setUp(splitSentence));
        ArrayList<String>list = new ArrayList<>(Arrays.asList("emin","elvin","Ahmed"));
        System.out.println(setUp2(list));
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Loop","cat","eliwtosu","tosuemiw","tosuzengilanni","senauyesenaybraat"));
        System.out.println(setUp3(words));


    }
    public static String setUp(String[] word){
        String reverse = "";
        for (int i = word[2].length()-1; i >=0 ; i--) {
            reverse+=word[2].charAt(i);
        }
        word[2]=reverse;
        String result = "";
        for (String each : word) {
            result+=each+" ";
        }
        return result;

    }


    public static ArrayList<String> setUp2(ArrayList<String> words){
        words.removeAll(Arrays.asList("Ahmed"));


        return words;
    }


    public static ArrayList<String> setUp3(ArrayList<String> words2){
        ArrayList<String>lis = new ArrayList<>();


        for (String each : words2) {
            if (each.length()<=4){
                lis.add(each);
            }
        }
        return lis;

    }

}