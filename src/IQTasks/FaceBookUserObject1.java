package IQTasks;

public class FaceBookUserObject1 extends FacebookUser{
    public static void main(String[] args) {
        FacebookUser user  = new FacebookUser();
        user.username = "apple";
        user.password = "mynameisapple";
        user.name = "Abbas";
        user.age = 24;
        user.friends = 444;
        user.checkMethod();
        System.out.println(user);


        FacebookUser user2 = new FacebookUser();
        user2.friends = 5001;
        user2.sendFriendRequest();




    }
}