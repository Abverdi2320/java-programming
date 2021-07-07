package day60_exceptions;

public class StringIndexIssue {
    public static void main(String[] args) {
        String word = "java";
        try {
            System.out.println("word = " + word);
            System.out.println(word.charAt(10));
            //gives StackTraces Exception

        } catch (Exception e) {
            System.out.println("Exception happened and caught");
            System.out.println("Reason = " + e.getMessage());

        }
        System.out.println(word.toUpperCase());

        String word2 = "selenium";
        try {
            System.out.println("word2 = " + word2);
            System.out.println(word2.substring(0,5));
            System.out.println(word2.substring(0,15));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Type of exceptions: " +e.getClass().getSimpleName());
            System.out.println("Reason is = " + e.getMessage());
        }

        System.out.println("--- END ---");





    }
}