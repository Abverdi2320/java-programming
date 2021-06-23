package ProblemSet1;

public class unit1_task2 {
    public static void main(String[] args) {
        /*
        Given a letter (char) determine if the character is an uppercase
         letter or lowercase letterEx: 'b'  --> lowercase'G' --> uppercase'O'  --> uppercase
         */

        char word = 'A';
        if (word>='a' && word<='z'){
            System.out.println("This is the lower case");
        }else if(word >= 'A' && word<='Z'){
            System.out.println("This is upper case");
        }
    }
}
