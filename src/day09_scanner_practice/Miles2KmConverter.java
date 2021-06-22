package day09_scanner_practice;

import java.util.Scanner;
public class Miles2KmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int minute= 24;
        int second = 33;
        String amOrPm = "PM";
        System.out.println(hour+":"+minute+":"+second+' '+amOrPm);


    }


    }

