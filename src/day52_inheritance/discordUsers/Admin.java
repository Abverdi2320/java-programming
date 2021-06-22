package day52_inheritance.discordUsers;

public class Admin extends User{

    public Admin(){
        System.out.println("Admin class constructor");
    }

    @Override
    public String toString (){
        return "User{" +
                "role='" + getRole() + '\'' +
                ", name='" + getName() + '\'' +
                ", ID=" + getID() +
                '}';
    }
}
