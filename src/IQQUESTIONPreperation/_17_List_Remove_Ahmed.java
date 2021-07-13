package IQQUESTIONPreperation;

import java.util.ArrayList;
import java.util.Arrays;

public class _17_List_Remove_Ahmed {
    public static void main(String[] args) {
        ArrayList<String> removeAhmed = new ArrayList<>(Arrays.asList("Elvin","Abbas","Emin","Ahmed"));
        removeAhmed.removeAll(Arrays.asList("Ahmed"));
        System.out.println("removeAhmed = " + removeAhmed);

    }
}
