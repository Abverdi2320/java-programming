package OfficeHours.Practice_03_23_2021;

public class ThreeTringContainsLetter {
    public static void main(String[] args) {
        String word1 = "java";
        String word2 = "mouse";
        String word3 = "computer";
        String biggestWordA = ""; // java

        if(word1.contains("a") && word1.length() > biggestWordA.length()){
            biggestWordA = word1;
        }

        if(word2.contains("a") && word2.length() > biggestWordA.length()){
            biggestWordA = word2;
        }

        if(word3.contains("a") && word3.length() > biggestWordA.length()){
            biggestWordA = word3;
        }

        if(biggestWordA.isEmpty()){
            System.out.println("No words contained A ");
        }

        System.out.println("longest word with A = " + biggestWordA);
    }
}
