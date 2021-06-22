package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("java");
        words.add("html");
        words.add("selenium");
        words.add("a");
        words.add("input");
        printStrList(words);

        printStrList(Arrays.asList("select","option","br"));

        List<Integer>nums = new ArrayList<>(Arrays.asList(1,2,3,4,765,45,76));
        int sum = sumIntegerList(nums);
        System.out.println("sum = " + sum);

    }

    public static void printStrList(List<String> strings) {
        for (String each : strings) {
            System.out.print(each + " ");
        }
        System.out.println();
    }


    public static int sumIntegerList(List<Integer> integers){
        int sum = 0;
        for (Integer each : integers){
             sum+=each;
        }
        return sum;
    }
}

