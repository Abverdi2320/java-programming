package ProblemSet1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListFourOrLess {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apples","tree","loop","cat","animal"));
        ArrayList<String> any = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length()<=4 ){
                any.add(list.get(i));
            }
        }
        System.out.println("any = " + any);


    }


}
