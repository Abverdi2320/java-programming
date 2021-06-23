package day19_class_vs_object_strings;

public class StringStartsWithEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("intell"));
        System.out.println(word.endsWith("ea"));
        System.out.println(word.endsWith("Int"));
        System.out.println(word.endsWith("idea"));
        System.out.println(word.endsWith("a"));


        String name = "Irina";
        if (name.endsWith("na")) {
            System.out.println("Maybe its a female name");
        } else {
            System.out.println("invalid name");
        }

        String firstName = "Mr";

        if (firstName.startsWith("Mr")) {
            System.out.println("Mister");
        } else if (firstName.startsWith("Dr")) {
            System.out.println("Doctor");
        } else if (firstName.startsWith("Mrs")) {
            System.out.println("Married woman");
        } else if (firstName.startsWith("Ms")) {
            System.out.println("Single woman");
        } else if (firstName.startsWith("Sr")) {
            System.out.println("Senior");
        } else {
            System.out.println("invalid");
        }


        String url = "https://www.stackoverflow.com";

        if(url.endsWith(".com")){
            System.out.println("Commercial website");
        }else if(url.endsWith(".ru")){
            System.out.println("Russian website");
        }else if(url.endsWith(".gov")){
            System.out.println("Government website");
        }else if(url.endsWith(".edu")){
            System.out.println("Education website");
        }else if(url.endsWith(".org")){
            System.out.println("Organization website");
        }else{
            System.out.println("Invalid website");
        }
    }

}

