package OfficeHours.Practice_05_12_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class BankAccount {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("cat", "dog","rabbit"));
        list.add("dowan");
        System.out.println("list = " + list);
        list.remove("rabbit");
        System.out.println("list = " + list);
        list.set(1,"snake");
        System.out.println("list = " + list);
        list.remove(list.set(2,"cheetah"));
        System.out.println("list = " + list);
        System.out.println();
        System.out.println(list.get(2));
        System.out.println(list.size());
        System.out.println(list.indexOf("cheetah"));

    }

}



