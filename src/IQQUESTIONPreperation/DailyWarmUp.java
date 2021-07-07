package IQQUESTIONPreperation;


import java.util.ArrayList;
import java.util.Arrays;

public class DailyWarmUp {
    public static void main(String[] args) {

       int num = 8;
       int arr [] = new int[num+1];
       arr[0] = 0;
       arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i]= arr[i-1]+arr[i-2];
        }
        System.out.println(Arrays.toString(arr));




    }
}




