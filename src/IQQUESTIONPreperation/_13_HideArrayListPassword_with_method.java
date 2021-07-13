package IQQUESTIONPreperation;

import java.util.ArrayList;
import java.util.Arrays;

public class _13_HideArrayListPassword_with_method {
    public static void main(String[] args) {
        ArrayList<String> password = new ArrayList<>(Arrays.asList("Emin","Elvin","Abbas"));
        System.out.println(setUp(password));

    }
    public static ArrayList<String>setUp(ArrayList<String> word){
        ArrayList<String> list = new ArrayList<>();
        String temp = "";

        for (int i = 0; i < word.size(); i++) {
            temp+= "*";

        }
        list.add(temp);
        return list;
    }
}
