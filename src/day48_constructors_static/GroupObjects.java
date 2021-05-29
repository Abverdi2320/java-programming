package day48_constructors_static;

import java.util.Arrays;

public class GroupObjects {
    public static void main(String[] args) {
        Group cyber = new Group("CyberElephants");// dependency injection
        //print size of members
        System.out.println(cyber.getMembers().size());
        cyber.addMember("Eliw");
        cyber.addMember("Rowka");
        cyber.addMember("Mezi");
        cyber.addMember("Qudret");
        System.out.println(cyber.getMembers().size());
        System.out.println(cyber);

        System.out.println();

        Group group2 = new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stephan","Wakshum","Akrem","Bulent","Andrea","Andrei"));
        //print all members. not toString
        System.out.println("Group 2 members = " + group2.getMembers());
        if (group2.getMembers().contains("Akrem")){
            System.out.println("Akrem is member of group 2");
        }else{
            System.out.println("Akrem is not group member");
        }

    }
}
