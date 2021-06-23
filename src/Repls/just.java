package Repls;

import java.util.*;

public class just {
    public static void main(String[] args) {
        int arr[] = {1, 3, 12, 5, 24, 7, 9, 10};
        boolean barr [] = new boolean[arr.length];

        for(int i = 0; i< arr.length; i++){
            if(arr[i]%2==0){
                barr[i]=true;
            }
        }
        System.out.println(Arrays.toString(barr));

    }
}
