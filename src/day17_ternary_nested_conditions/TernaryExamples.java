package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 90;
        String result = (score > 60) ? "Pass" : "Fail";
        System.out.println(result);


        String quality = "good";
        System.out.println(quality.equals("good") ? 100 : 0);
        int rating = quality.equals("good") ? 100 : 0;

        int score3 = 100;
        char grade = (score3 > 90) ? 'A' : 'B';
        System.out.println("grade = " + grade);

        String evenodd = (score % 2 == 0) ? "even" : "odd";
        System.out.println(evenodd);
    }
}
