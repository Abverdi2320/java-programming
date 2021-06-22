package day21_string_manupilation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word = "mom";
        char first = word.charAt(0);
        char second = word.charAt(2);

        if (first == second) {
            System.out.println("first and last letters match");
        } else {
            System.out.println("letters mismach");
        }


        String car = "level";
        char wordOne = car.charAt(0);
        char wordTwo = car.charAt(car.length()-1);
        System.out.println(wordOne);
        System.out.println(wordTwo);

        if(wordOne==wordTwo){
            System.out.println(car + " - first and last match");
        }else{
            System.out.println(car + " - doesnt match");
        }


           String name = "java";
        System.out.println(name.indexOf("j")); // returns 0






    }
}