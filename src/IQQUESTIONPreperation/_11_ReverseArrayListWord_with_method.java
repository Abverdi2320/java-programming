package IQQUESTIONPreperation;

import java.util.ArrayList;
import java.util.Arrays;

public class _11_ReverseArrayListWord_with_method {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("emin","elvin","abbas"));
        System.out.println(setUp(list));

    }
    public static ArrayList<String> setUp(ArrayList<String> words){
        ArrayList<String> reverse = new ArrayList<>();
        for (int i = words.size()-1; i >= 0 ; i--) {
            reverse.add(words.get(i));

        }
        return reverse;

    }
}
