package ProblemSet1;

public class palindrome {
    public static void main(String[] args) {
        //Find Palindrome of "Civic"
        String str = "Civic";
        boolean isPalindrome = true;

        for (int i = 0; i<str.length()/2; i++){
            if (str.charAt(i)!=str.charAt(str.length()-1-i));
            isPalindrome = false;
            break;
        }
         System.out.println(isPalindrome);
    }
}