package day48_constructors_static;

import java.util.Arrays;

public class GroupObjects {
    public static void main(String[] args) {
        Group group1 = new Group("CyberElephants");// dependency injection
        //print size of members
        System.out.println(group1.getMembers().size());
        group1.addMember("Eliw");
        group1.addMember("Rowka");
        group1.addMember("Mezi");
        group1.addMember("Qudret");
        System.out.println(group1.getMembers().size());
        System.out.println(group1);

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

        //remove some members from group1
        group1.removeMember("Eliw");
        group1.removeMember("Qudret");
        System.out.println(group1);

    }
}
