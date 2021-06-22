package day18_condotions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todayClass = "Python";

        if(todayClass.equals("Java"))
            System.out.println("Java is fun ");
        else
            System.out.println("Its not Java it is " +todayClass);


        int a = 1;

        if(a==1)
            System.out.println("A is 1");
            System.out.println("1 is A");



    }
}
