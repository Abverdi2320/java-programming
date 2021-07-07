package IQQUESTIONPreperation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class _13_HideArrayListPassword {
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>(Arrays.asList("selenium","emin","elvin","abbas"));
        ArrayList<String> container = new ArrayList<>();
        String temp = "";

        for (int i = 0; i < word.size(); i++) {
            temp+='*';
        }
        container.add(temp);
        System.out.println("container = " + container);
    }
}
