package day12_conditional_statements;

public class CompareChars {
    public static void main(String[] args) {
        char letter1 = 'G';
        char letter2 = 'H';
        System.out.println(letter1==letter2);//71==/72
        System.out.println(letter1>letter2);//71>72
        System.out.println(letter1<letter2);//71<72

        char grade = 'A';
        boolean pass = grade <= 'D';
        System.out.println("Did u pas the exam?? " + pass);
    }
}
