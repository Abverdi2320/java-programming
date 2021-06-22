package day20_string_manipulation;

import java.lang.*; // It means import all classes from java.lang package

public class StringCreationMethods {
    public static void main(String[] args) {
        String word1 = "potato";
        String word2 = new String("tomato");
        String word3 = "";
        String word4 = new String();
        String name = "Abbas";
        System.out.println(name.toUpperCase()+ " " + name.length()+ " " +name.toLowerCase());
        String city = "";
        System.out.println(city.length()==0);
    }
}
