package Reviews;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CountLetterArrayList {
    public static void main(String[] args) {
        /*

         */
        ArrayList<String>list = new ArrayList<>(Arrays.asList("java","html","css","java","javascript","selenium"));
       int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                if (list.get(i).charAt(j)=='a'){
                    count++;
                }
            }
        }
        System.out.println("count = " + count);
    }
}
