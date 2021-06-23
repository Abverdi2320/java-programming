package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args){
        String title = " Sdet";
        String company = "Facebook";
        String jobdescription = "Test automation";
        double salary = 130000;
        int yearexperience = 10;
        boolean hasBenefits = true;

        System.out.println("Title:\t\t\t   " + title);
        System.out.println("Company:\t\t\t" + company);
        System.out.println("Job description\t\t" + jobdescription);
        System.out.println("Salary:\t\t\t\t$"          + salary );
        System.out.println("Year experience:\t" + yearexperience);
        System.out.println("Has benefits:\t\t"    + hasBenefits );

    }
}
