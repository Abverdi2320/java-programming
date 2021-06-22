package day31_arrays;

import java.util.*;

public class ArraysUtil {
    public static void main(String[] args) {
        int [] num = {2,5,1,6,5,33,100000};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println("minimum value = " +num[0]);
        System.out.println("maximum value = " +num[num.length-1]);



        String [] names = {"rahib", "abulaiti","dinara","ainur","cigdem","teymur"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println("[" +String.join(", ",names)+ "]");


        //sort words in reverse order

        Arrays.sort(names, Collections.reverseOrder());
        System.out.println(Arrays.toString(names));


    }
}
