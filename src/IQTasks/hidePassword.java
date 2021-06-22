package IQTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class hidePassword {
    public static void main(String[] args) {
        ArrayList<String> pass = new ArrayList<>(Arrays.asList("one","hi","hold"));
        for (int i = 0; i < pass.size(); i++) {
            String hide = "";
            for (int j = 0; j < pass.get(i).length(); j++) {
                hide+="*";
            }
            System.out.print(hide+" ");
        }
    }
}
