package IQQUESTIONPreperation;

import java.util.ArrayList;
import java.util.Arrays;

public class _17_List_Remove_Ahmed_with_method {
    public static void main(String[] args) {
        ArrayList<String> names  = new ArrayList<>(Arrays.asList("Nadir","Saim","Gurhan","Muradil"));
        System.out.println(removeMuradil(names));

    }
    public static ArrayList<String> removeMuradil(ArrayList<String> name){
        name.removeAll(Arrays.asList("Muradil"));
        return name;
    }
}
