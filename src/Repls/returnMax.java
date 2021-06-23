package Repls;

import java.util.*;

public class returnMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(max(scan.nextInt(), scan.nextInt()));

    }

    public static int max(int x, int max) {
        if (x > max) {
            return x;
        } else if (max > x) {
            return max;
        }else{
            return x;
        }
    }
}