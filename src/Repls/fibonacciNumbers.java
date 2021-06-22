package Repls;

import java.util.*;

public class fibonacciNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);

    }

    public static void fib(int num) {
        int firstNum = 0;
        int secNum = 1;
        for (int i = 0; i < num; i++) {
            int temp =firstNum;
            firstNum=secNum;
            secNum=temp+secNum;
        }
        System.out.println("firstNum = " + firstNum);

    }
}
