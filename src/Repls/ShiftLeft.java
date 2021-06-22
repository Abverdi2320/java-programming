package Repls;

import java.util.Arrays;

public class ShiftLeft {
    public static void main(String[] args) {
        int num [] ={6,2,5,3};
        int temp = num[0];


        for(int i = 1; i< num.length; i++){
            num[i-1]=num[i];
        }
        num[num.length-1]=temp;

        System.out.println(Arrays.toString(num));
    }
}
