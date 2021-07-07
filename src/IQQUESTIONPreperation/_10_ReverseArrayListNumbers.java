package IQQUESTIONPreperation;

import OfficeHours.Practice_06_21_2021.A;

import java.util.ArrayList;
import java.util.Arrays;

public class _10_ReverseArrayListNumbers {
    public static void main(String[] args) {
        ArrayList<Integer>nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer>container = new ArrayList<>();

        for (int i = nums.size()-1; i >= 0; i--) {
            container.add(nums.get(i));
        }
        System.out.println("container = " + container);
    }

    }

