package day38_Methods;

import java.util.Arrays;

import static day38_Methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if(StringUtils.isNullOrEmpty(userName)){
            System.out.println("FAIL: Username cannot be null or empty");
        }

        System.out.println("isPalindrome (civic) = " +StringUtils.isPalindrome("civic"));
        System.out.println("isPalindrome(kayak) = " +StringUtils.isPalindrome("kayak"));
        System.out.println("isPalindrome(Cybertek) = " +isPalindrome("Cybertek"));


        String word = "java";
        String revWord = StringUtils.reverse(word);
        System.out.println("word = " + word);
        System.out.println("revWord = " + revWord);

    }


}
