package OfficeHours.Practice_04_13_2021;

import java.util.Arrays;

public class GradeBook {
    public static void main(String[] args) {
        String words = "knife, wooden spoon, plates, cups,forks,pan,pot,trash can";
        String[] arrWords = words.split(", ");
        System.out.println(Arrays.toString(arrWords));

        for(String each:arrWords){
            if(each.contains(" ")){
                System.out.println("each = " + each);
            }

        }
    }
}
