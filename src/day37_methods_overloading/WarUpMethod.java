package day37_methods_overloading;

public class WarUpMethod {
    public static void main(String[] args) {
        loginVoid("Cybertekstudent", "abc123");
       // loginVoid("cybertek","answer");
        System.out.println(login("Cybertekstudent","abc123"));

    }

    public static void loginVoid(String userName, String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";
        if (userName.equalsIgnoreCase(secretUserName) && password.equals(password)) {
            System.out.println("login successful welcome Cybertek Student");
        } else {
            System.out.println("Invalid log in");
        }


    }

    public static boolean login(String userName, String password) {
        String secretUserName = "Cybertekstudent";
        String secretPassWord = "abc123";
        if (userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassWord)) {
            return true;
        } else {
            return false;
        }
    }
}
