package IQQUESTIONPreperation;

public class _8_IQPasswordValidationTask {
    /*
0. requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit 6
     */
    public static void main(String[] args) {
        String password = "Password@5";
        boolean isValidPassword = false;

        String uppercase = "(.*[A-Z].*)";
        String lowercase = "(.*[a-z].*)";
        String numbers = "(.*[0-9].*)";
        String characters = "(.*[-/, :-@].*)";

        if (password.matches(uppercase)) {

            isValidPassword = true;
            System.out.println("Welcome");
        } else {
            System.out.println("Password needs at least 1  upper case");

        }
        if (password.matches(lowercase)) {
            isValidPassword = true;

        } else {
            System.out.println("Password needs at least 1 lower case");
        }
        if (password.matches(numbers)) {
            isValidPassword = true;

        } else {
            System.out.println("Password needs at least 1 number");
        }
        if (password.matches(characters)) {
            isValidPassword = true;

        } else {
            System.out.println("Password needs at least 1 digit");
        }
        if (!password.contains(" ")) {

            isValidPassword = true;

        } else {
            System.out.println("Password should not contains any space ");
        }
        if (password.length() > 6) {

            isValidPassword = true;

        } else {
            System.out.println("Password should be longer than 6 characters");
        }

    }
}