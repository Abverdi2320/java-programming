package Repls;

import java.util.*;

public class ReturnMethodIsEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isEven(in.nextInt()));
    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }else {
           return false;

        }


    }
}
