package Reviews;

public class SocialNetwork_Object {
    public static void main(String[] args) {
        Social_Network social_network = new Social_Network();
        social_network.userName = "CrazyFrog";
        social_network.password = "Glaze";
        Instagram.post("Video");
        System.out.println(social_network);



    }
}
