package OfficeHours.Practice_03_30_2021;

import java.util.*;

public class MaxNumberFrom5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        int min = 0;

        for (int i = 0; i<5; i++){
            System.out.println("Enter a number");
            int number = input.nextInt();

            if(number>max){
                max =number;
            }
            if(number<min){
                min=number;
            }
        }

        System.out.println("min = " + min);

    }
}
