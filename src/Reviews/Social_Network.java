package Reviews;

public class Social_Network {
    String userName;
    String password;

    @Override
    public String toString() {
        return
                "username='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void login(){
        System.out.println("Your username is " +userName + " and your password is " +password);

    }
}
