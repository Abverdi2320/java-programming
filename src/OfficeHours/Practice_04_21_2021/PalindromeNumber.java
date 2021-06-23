package OfficeHours.Practice_04_21_2021;

public class PalindromeNumber {
    public static void main(String[] args) {
 //       System.out.println(112233 % 1)
 //       System.out.println(112233 % 10);
 //       System.out.println(112233 % 10);
        System.out.println(isPalindrome(1234321));
    }

    public static boolean isPalindrome(int number){
      int reverse = 0;
      int temp = number;
      while(temp!=0){
          int lastDigit = temp%10;
          reverse = (reverse*10)+lastDigit;
          temp/=10;
          System.out.println(reverse);

        }
        return reverse==number;
    }
}
