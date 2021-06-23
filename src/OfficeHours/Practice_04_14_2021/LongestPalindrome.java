package OfficeHours.Practice_04_14_2021;

public class LongestPalindrome {
    public static void main(String[] args) {
        String[] words = {"java", "longer word", "civic", "apple", "mom", "racecar", "mom", "anna"};
        String longestPalindrome = "";

        for (String eachWord : words) {

            boolean isPalindrome = true;

            for (int i = 0; i < eachWord.length() / 2; i++) {

                if (eachWord.charAt(i) != eachWord.charAt(eachWord.length() - 1-i)) {
                    isPalindrome = false;
                    break;
                }
            }
            if(isPalindrome && eachWord.length()>longestPalindrome.length()){
                longestPalindrome=eachWord;
            }
        }
        System.out.println(longestPalindrome);
    }
}
