package IQQUESTIONPreperation;

import java.util.Arrays;

public class _16_Fibonacci_Numbers {
    public static void main(String[] args) {
     int nums = 8;
     int [] arr = new int[nums+1];
     arr[0]=0;
     arr[1]=1;
        for (int i = 2; i < arr.length ; i++) {
            arr[i]= arr[i-1]+arr[i-2];

        }
        System.out.println(Arrays.toString(arr));

    }
}
