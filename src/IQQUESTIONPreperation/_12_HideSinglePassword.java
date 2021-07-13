package IQQUESTIONPreperation;

import java.util.ArrayList;
import java.util.Arrays;

public class _12_HideSinglePassword {
    public static void main(String[] args) {
        String word = "pineapple";
        String container = "";
        String temp = "";

        for (int i = 0; i < word.length(); i++) {
            temp+="*";
        }
        container=temp;
        System.out.println(container);

    }
}
