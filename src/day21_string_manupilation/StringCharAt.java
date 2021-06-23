package day21_string_manupilation;

public class StringCharAt {
    public static void main(String[] args) {
        String word = "Nadir";
        //01234
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(4));

        System.out.println(word + "-" + word.length());


        String company = "Cybertek";
        char first = company.charAt(0);
        char second = company.charAt(1);
        char third = company.charAt(2);
        char fourth = company.charAt(3);
        char fifth = company.charAt(4);
        char six = company.charAt(5);
        char seven = company.charAt(6);
        char eight = company.charAt(7);
        System.out.println(first + " " + second + " " + third + " " + fourth + " " + fifth + " " + six + " " + seven + " " + eight);

        String withSpaces = first + " " + second + " " + third + " " + fourth + " " + fifth + " " + six + " " + seven + " " + eight;
        System.out.println("withSpaces = " + withSpaces);



    }
}
