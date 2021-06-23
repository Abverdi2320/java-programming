package day50_inheritance;

public class InheritanceTest  {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Bakyt";
        p1.age = 30;

        p1.talk();
        p1.walk();
        p1.work("SDET");


        Teacher t1 = new Teacher();
        t1.teacherID = 23334133;
        t1.name = "Saim";
        t1.age = 25;
        t1.talk();
        t1.walk();
        t1.work("MENTOR");
        t1.teach("Java Inheritance");

        Student student = new Student();
        student.name = "Abbas";
        student.age = 24;
        student.talk();
        student.walk();
        student.work("SDET");
        student.school = "Cybertek";
        student.study(" Java programming inheritance");

    }
}
