package Reviews;

import java.util.ArrayList;
import java.util.Arrays;

public class StringArraysToSumArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123", "34", "513"));
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum = 0;
            for (int j = 0; j < list.get(i).length(); j++) {
                sum+=Integer.parseInt(list.get(i).charAt(j)+"");
            }
            list.set(i,sum+"");
        }
        System.out.println(list);

    }
}
