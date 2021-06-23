package OfficeHours.Practice_03_15_2021;

public class NumberDivisibleBy235 {
    public static void main(String[] args) {

        int num = 65;
        boolean by2 = num % 2 == 0; // temiz bolunur
        boolean by3 = num % 3 == 0; // tek reqem bolunur
        boolean by5 = num % 5 == 0;

        System.out.println(num + " is divisible by2: " + by2);
        System.out.println(num + " is divisible by3: " + by3);
        System.out.println(num + " is divisible by5: " + by5);
    }
}
