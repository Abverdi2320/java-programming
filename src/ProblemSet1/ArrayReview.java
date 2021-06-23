package ProblemSet1;

import java.util.Arrays;

public class ArrayReview {
    public static void main(String[] args) {
     /*
     Assign 1-100 to each index of the array.  Then use a for each loop to print out all the elements of the array
      */

        int [] arr = new int[101];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
