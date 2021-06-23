package IQTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apples","tree","loop","cat","animal","shortcut"));

        for (int i = 0; i < list.size(); i++) {
            String any = "";
            for (int j = 0; j < list.get(i).length(); j++) {
                any+=list.get(i).charAt(j);
            }
            if (any.length()<=4){
                System.out.println(any);
            }

        }
    }
}
