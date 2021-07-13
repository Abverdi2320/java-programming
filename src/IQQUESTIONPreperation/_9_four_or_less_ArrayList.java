package IQQUESTIONPreperation;

import java.util.ArrayList;
import java.util.Arrays;

public class _9_four_or_less_ArrayList {
    public static void main(String[] args) {
       ArrayList<String> words = new ArrayList<>(Arrays.asList("tree","loop","cat","animal","shortcut"));
       ArrayList<String> container = new ArrayList<>();

        for (String each : words) {
            if (each.length()<=3){
                container.add(each);
            }
        }
        System.out.println("container = " + container);
    }
}
