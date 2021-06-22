package OfficeHours.Practice_03_30_2021;

import java.util.*;
public class CreateEmail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words:");
        String wordOne = scan.nextLine();
        String wordTwo = scan.nextLine();
        String email="";

        if(wordOne.length() >=6 && wordTwo.length()>=6){

            email=wordOne.substring(0,4); //james if u want the firs 4 character it will print
            email+=wordTwo.substring(wordTwo.length()-3);// to find last index of it
            email+="@cybertek.com";
            System.out.println(email);
        }else{
            System.out.println("Invalid Data");
        }
    }
}
