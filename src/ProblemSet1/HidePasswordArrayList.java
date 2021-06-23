package ProblemSet1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HidePasswordArrayList {
    public static void main(String[] args) {
        /*
        Given an array of passwords (String).
        Hide each password as a star (*) and show the hidden password
         */
//        String password[] = {"one", "hi", "hold"};
//        ArrayList<String> hidden = new ArrayList<>(Arrays.asList());
//        for (String each:password){
//            String any = "";
//            for (int i = 0; i < password.length; i++) {
//                any+="*";
//            }
//            hidden.add(any);
//        }
//        System.out.println("hidden = " + hidden);
        ArrayList<String> password = new ArrayList<>(Arrays.asList("Abbas","Elvin","Emin"));
        List hidden = new ArrayList();
        for (int i = 0; i < password.size(); i++) {
            String any = "";
            for (int j = 0; j < password.size(); j++) {
                any+="*";
            }
            hidden.add(any);
        }
        System.out.println("hidden = " + hidden);

    }
}
