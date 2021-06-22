package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFromList {
    public static void main(String[] args) {
        //declare Integer arraylist with following numbers
        List<Integer>nums = new ArrayList<>(Arrays.asList(2,4,4,1,5,6,0,6));
        System.out.println(nums);


        //loop through the list

        List<Integer> uniqueList = getUniqueList(nums);
        System.out.println("\nUniqueList = " +uniqueList);
    }

    public static List<Integer> getUniqueList(List<Integer> nums) {
        List<Integer> uniqueList = new ArrayList<>();


        for(int each: nums){
            //check if number appears only ONCE in the list
            if (Collections.frequency(nums,each)==1){
                //print that number
                System.out.println("Unique numbers are = " +each +" ");
                uniqueList.add(each);
            }
        }
        return uniqueList;
    }
}
