package Repls;

import java.util.*;

public class next3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s);
    }

    public static void person(String info) {
        String[]details = info.split(",");
        System.out.println(Arrays.toString(details));
        System.out.println("person name: " +details[0]);
        System.out.println("last name: "  +details[1]);
        System.out.println("age: " + details[2]);


    }
}
