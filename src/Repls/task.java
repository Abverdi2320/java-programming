package Repls;

import java.util.*;

public class task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        int firstHalfLength = word.length();
        System.out.println(word.substring(0,word.length()/2)+word.substring(0,word.length()/2));
    }

    }

