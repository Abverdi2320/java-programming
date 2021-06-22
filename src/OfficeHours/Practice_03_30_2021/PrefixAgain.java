package OfficeHours.Practice_03_30_2021;

public class PrefixAgain {
    public static void main(String[] args) {
        String str = "abXyabc";  //java
        int n =1;   //3
        //jav  prefix means first character
        String prefix = str.substring(0,n);
        String remaining = str.substring(n);

        System.out.println(remaining.contains(prefix));


    }

}
