package Practice;

import java.util.*;

public class Arraypractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int size = scan.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();

        }

        int numbers[] = new int[nums.length * 2];
        numbers[numbers.length - 1] = nums[nums.length - 1];


        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(numbers));

    }
}







