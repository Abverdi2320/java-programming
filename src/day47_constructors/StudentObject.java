package day47_constructors;

public class StudentObject {
    public static void main(String[] args) {
        Student st1 = new Student();//runs no-args constructor
        Student st2 = new Student();//runs no-args constructor
        Student name = new Student("Abbas");
        Student name2 = new Student("Elvin");
        Student name3 = new Student("Emin");
        Student aaa = new Student("Abbas", 24);
    }
}
