package IQQUESTIONPreperation;

import java.util.Arrays;

public class _16_Fibonacci_with_method {
    public static void main(String[] args) {
        System.out.println(setUp(8));

    }
    public static String setUp(int  num){
        int arr [] = new int[num+1];
        arr[0]=0;
        arr[1]=1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        return Arrays.toString(arr);
    }
}
