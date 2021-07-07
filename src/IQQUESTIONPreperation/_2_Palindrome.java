package IQQUESTIONPreperation;

public class _2_Palindrome {
    public static void main(String[] args) {
        String word = "civic";
        boolean isPalindrome = true;
        for (int i = 0; i<word.length()/2; i++){
            if (word.charAt(i)!= word.charAt(word.length()-1-i)){
                isPalindrome = false;
            }
        }
        System.out.println(isPalindrome);


    }
}
