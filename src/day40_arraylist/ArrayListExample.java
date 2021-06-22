package day40_arraylist;

import java.util.*;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1243);
        nums.add(3344);
        nums.add(764);
        //nums.add("java"); ERROR
        System.out.println("size = " + nums.size());

        //reading from arrayList
        System.out.println("index 0 = " + nums.get(0));
        System.out.println("index 1 = " + nums.get(1));
        System.out.println("index 2 = " + nums.get(2));
        //System.out.println("index 3  = " +nums.get(3));

        //print all values in same line:
        System.out.println(nums);

        //it will show only first and last nums
        nums.remove(1); // remove element at index 1
        System.out.println("nums = " + nums);


    }
}