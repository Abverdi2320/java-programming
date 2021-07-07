package IQQUESTIONPreperation;

public class _3_longestPalindrome {
    public static void main(String[] args) {
        String [] words = {"civic","malayalam","bob"};
        String longestPalindrome = "";
        boolean isPalindrome = true;
        for (String each : words) {
            for (int i = 0; i<each.length()/2; i++){
                if (each.charAt(i)!= each.charAt(each.length()-1-i)){
                    isPalindrome = false;
                }
            }
            if (each.length()>longestPalindrome.length()){
                longestPalindrome=each;

            }
        }
        System.out.println("isPalindrome = " + isPalindrome);
        System.out.println("longestPalindrome = " + longestPalindrome);
    }
}