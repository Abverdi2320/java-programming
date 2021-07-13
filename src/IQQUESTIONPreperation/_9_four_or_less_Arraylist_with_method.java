package IQQUESTIONPreperation;

import java.util.ArrayList;
import java.util.Arrays;

public class _9_four_or_less_Arraylist_with_method {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("tree","loop","cat"));
        System.out.println(setUp(words));

    }
    public static ArrayList<String> setUp(ArrayList<String> word){
        ArrayList<String> container = new ArrayList<>();
        for (String each : word) {
            if (each.length()<4){
                container.add(each);
            }
        }
        return container;
    }
}
