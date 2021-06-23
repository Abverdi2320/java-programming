package IQTasks;

public class passwordValidation {
    public static void main(String[] args) {
        System.out.println(PassWordvalidation("A1bbas@"));

    }


    public static boolean PassWordvalidation(String password) {
        String lowercase = "(.*[a-z].*)";
        String uppercase = "(.*[A-Z].*)";
        String numbers = "(.*[0-9].*)";
        String specialchars = "(.*[ -/, :-@].*)";

        boolean valid = false;
        if (password.matches(lowercase) && password.matches(uppercase) &&
                password.matches(numbers) && password.matches(specialchars) &&
                password.length() >= 6 && !password.matches(" ")) {
            valid = true;
        }


        return valid;


    }
}
