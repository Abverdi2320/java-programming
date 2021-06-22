package IQTasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TargetWord {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>(Arrays.asList("java","html","css","java","javascript","selenium"));
        ArrayList<String>Target = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String any ="";
            int count =0;
            for (int j = 0; j < list.get(i).length(); j++) {
                any+=list.get(i).charAt(j);
                count++;
            }

        }
    }
}
