package ProblemSet1;

public class MaxMinArray {
    public static void main(String[] args) {
        /*
        Write a program that can find the maximum number from any given int array
         */
        int arr[] = {3, 5, 42, 99, 65};
        int min = arr[0];
        int max = arr[0];

        for (int each : arr) {
            if (each < min) {
                min = each;
            }
            if (each > max) {
                max = each;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);


        int nums[] = {1, 6, 3, 8, 45, 2421, 766, 43, 211};
        int average = 0;

        for (int any : nums){
            average+=any;
        }
        System.out.println(average/nums.length);


    }
}
