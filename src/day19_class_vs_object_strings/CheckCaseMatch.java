package day19_class_vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "KG";

        if (countryCode.equals(countryCode.toUpperCase())) {
            System.out.println("Pass - case is match");
        }else{
            System.out.println("Fail - case is incorrect");
        }

        String word = "Java";
        String uWord = word.toUpperCase();
        System.out.println(word);
        System.out.println(uWord);

        if(word.equals(uWord)){
            System.out.println("case match");
        }else{
            System.out.println("case mismatch");
        }


        String worrd = "selenium";
        System.out.println(worrd.startsWith("s"));
        System.out.println(worrd.startsWith("selen"));


    }
}