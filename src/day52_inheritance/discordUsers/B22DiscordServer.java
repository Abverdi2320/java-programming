package day52_inheritance.discordUsers;

public class B22DiscordServer {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setID(2272);
        user1.setName("Abbas");
        user1.setRole("Student");

        Admin admin1 = new Admin();
        admin1.setID(43145);
        admin1.setName("Burak Kara");
        admin1.setRole("Admin");

        System.out.println(user1);
        System.out.println(admin1);
    }
}
