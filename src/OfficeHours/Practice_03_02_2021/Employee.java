package OfficeHours.Practice_03_02_2021;

public class Employee {
    public static void main(String[] args) {

         String firstName = "Abbas";
         String lastName = "Verdi";
         String companyName = "Lamborghini";
         double salary = 900000;
         String startDay = "24, " ;
         String startMonth = "February";
         int startYear = 2021;
         boolean areTheyFullTime = true;
         String jobTitle = "Engineer";
         String officeAdress = "2324 Park Avenue";

        System.err.println("***** Lamborghhini New Hire Information *****");
        System.out.println("Your start date as an " + jobTitle + " will be on \n" +startMonth + startDay + startYear
                + " You are full time: ---> " +areTheyFullTime + " \n and will be making "
                + salary + " per year" + " the office located at \n" + officeAdress );

    }
}
