package Repls;

import java.util.*;

public class Saim {
    public static void main(String[] args) {
        int[] nums = {1, 2, -3, 4, -34, 55, 78, 90, 33, 10};
        int countEven = 0;
        int countOdd = 0;

        for (int each : nums) {
            if (each % 2 == 0) {
                countEven++;


            }
            if (each % 2 != 0) {
                countOdd++;

            }

        }

        System.out.println("countEven = " + countEven);//6
        System.out.println("countOdd = " + countOdd);//4


        int evenArr[] = new int[countEven];
        int oddArr[] = new int[countOdd];
        int indexEven = 0;
        int indexOdd = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenArr[indexEven] = nums[i];
                indexEven++;
            }
            if (nums[i] % 2 != 0) {
                oddArr[indexOdd] = nums[i];
                indexOdd++;
            }
        }


    }


}

