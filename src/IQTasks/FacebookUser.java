package IQTasks;

public class FacebookUser {
    String username;
    String name;
    String password;
    int age;
    int friends;

    @Override
    public String toString() {
        return "FacebookUser{" +
                "username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", friends='" + friends + '\'' +
                '}';
    }

    public void FacebookUser(String username, String password,String name) {
        this.username = username;
        this.password = password;
        this.name = name;


    }

    public void checkMethod(){
        if (password.contains(username)){
            System.out.println("Password can't contain username.Please change password");
        }else{
            this.username = username;
            this.password = password;

        }
    }


    public boolean sendFriendRequest(){
        if (friends >= 5000 ){
            System.out.println("Can't accept friend request ==== " + false);
        }else{
            System.out.println("Friend request sent to Emin ====" + true);
        }
        return true;
    }


    public void userInfo(){

    }
}
