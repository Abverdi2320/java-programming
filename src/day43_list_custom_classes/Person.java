package day43_list_custom_classes;
//firstname, age
public class Person {
    // Data -> variables
    String firstName;
    int age;
    char gender;
    //behaviour
    public void speak(){
        System.out.println("Person is speaking ");
    }

}

class People{ //class for running with main method
    public static void main(String[] args) {
        //create object of Person class - Instantiate Person class
        Person person1 = new Person();
        person1.firstName = "Abbas";
        person1.age = 24;
        person1.gender = 'M';
        person1.speak();

        System.out.println("Firstname = " +person1.firstName);
        System.out.println("Age = " +person1.age);
        System.out.println("Gender = " +person1.gender);
        System.out.println();

        Person person2 = new Person();
        person2.firstName = "Elvin";
        person2.age = 31;
        person2.gender = 'M';
        person2.speak();
        System.out.println("Firstname = " +person2.firstName);
        System.out.println("Age = " +person2.age);
        System.out.println("Gender = " +person2.gender);



    }

}
