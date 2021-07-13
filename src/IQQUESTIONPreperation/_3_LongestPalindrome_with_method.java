package IQQUESTIONPreperation;

public class _3_LongestPalindrome_with_method {
    public static void main(String[] args) {
        String [] arr = {"civic","bob","malayalam"};
        System.out.println(setUp(arr));

    }
    public static String setUp(String[] words){
        boolean isPalindrome = true;
        String longestPalindrome = "";
        for (String each : words) {
            for (int i = 0; i < each.length()/2; i++) {
                if (each.charAt(i)!=each.charAt(each.length()-1-i)){
                    isPalindrome = false;
                }
            }
            if (each.length()>longestPalindrome.length()){
                longestPalindrome=each;
            }
        }
        return longestPalindrome;
    }
}
