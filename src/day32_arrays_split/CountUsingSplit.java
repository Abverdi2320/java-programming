package day32_arrays_split;

import java.util.*;

public class CountUsingSplit {
    public static void main(String[] args) {

        String cats = " bengal cat tabby cat persian cat no cat here";
        String[] arr = cats.split("cat");
        System.out.println(arr.length-1);

        for(String each : arr){
            System.out.println("Type of cats = " + each);
        }




    }
}
