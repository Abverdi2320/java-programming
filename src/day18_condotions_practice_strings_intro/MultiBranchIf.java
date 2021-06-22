package day18_condotions_practice_strings_intro;

public class MultiBranchIf {
    public static void main(String[] args) {

        int number = -3;

        if (number > 0) {
            System.out.println("Number = " + number);
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println(number + "is zero");
        }
    }
}
