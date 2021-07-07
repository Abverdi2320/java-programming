package IQQUESTIONPreperation;

import java.util.ArrayList;
import java.util.Arrays;

public class _9_four_or_less_ArrayList {
    public static void main(String[] args) {
       ArrayList<String> words = new ArrayList<>(Arrays.asList("tree","loop","cat","animal","shortcut"));
       ArrayList<String> container = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length()<=4){
                container.add(words.get(i));
            }
        }
        System.out.println("container = " + container);
    }
}
