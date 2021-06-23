package Reviews;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rr {
    public static void main(String[] args) {
        // look to the left side it is auto-boxing
        Integer i = new Integer(52);
        int n = Integer.parseInt("23");

        ArrayList<String> myArray = new ArrayList<>();//size = 0, capacity = 100;
        ArrayList<String> myArray2 = new ArrayList<>(100);//capacity = 100, size = 0;
        System.out.println("myArray2.size() = " +myArray2.size());
        List<String> myArray3 = new ArrayList<>(Arrays.asList());


    }
}
