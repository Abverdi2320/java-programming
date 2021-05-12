package IQTasks;

public class palindrome {
    public static void main(String[] args) {
        String name = "azza";
        boolean isPalindrome = true;
        for (int i = 0; i < name.length() / 2; i++) {
            if(name.charAt(i)!=name.charAt(name.length()-1-i)){
                isPalindrome = false;
                break;



            }
        }
        System.out.println(isPalindrome);
        System.out.println(isPalindrome);
    }
}
