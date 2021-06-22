package OfficeHours.Practice_03_02_2021;
//src--> new package called OfficeHours-->new package
// Practice_03_02_2021

/*
Make a class PersonInfo
make a main method

Create variables and give value related to you:

    - String name
    - byte age
    - char gender
    - boolean student
    - short number of siblings
    - long favorite number
    - int number of seasons in your area
    - double birth date: (month.day)
    - int year
    - String full birthday date with year
    - String favorite quote

    - Print the person information



    - Challenge: print your name in a cool way (unicode)
    - Challenge: char star

 */
public class PersonInfo {
    public static void main(String[] args){
        String name, fullBirthdate, favoriteQuote;
        byte age;
        char gender;
        boolean student;
        short numberOfSibling;
        long favoriteNumber;
        int numberOfSeasons, year;
        double birthDate;

        name = "Abbas";
        age = 24;
        gender = 'M';
        numberOfSibling = 2;
        favoriteNumber = 13;
        numberOfSeasons = 4;
        birthDate = 3.2;
        year = 2021;
        fullBirthdate = "" + birthDate + '.' + year  ;
        //fullBirthDate = birthDate + year + ";
        //2025.2 --> adds first then turns to String
        favoriteQuote = "have a good mindset";


        System.out.println("Full birthdate: " + fullBirthdate);
        System.out.println("Age: " + age);
        System.out.println("Name: " + name );
        System.out.println("Full birthdate: " +fullBirthdate );


        //other printing







    }
}
