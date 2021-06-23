package Practice;

import java.util.*;

public class ArraysPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        int[] secondArr = new int[2];
        if (size >= 2) {
            secondArr [0] = num[0];
            secondArr [1] = num[1];
        }else if (size<2){
            secondArr=num;
        }



    }
}
