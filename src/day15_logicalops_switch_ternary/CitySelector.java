package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Seoul";

        if (city.equals("Moscow") || city.equals("Seoul")) {
            System.out.println("Willing to relocate to  " + city);
        } else {
            System.out.println("Not considering " + city);
        }

        String teacher = "Murodil";

        if (teacher.equals("Murodil") || teacher.equals("Saim")) {
            System.out.println("It is Java class with " + teacher);
        } else {
            System.out.println("Soft skill class with " + teacher);
        }
        if (teacher.equals("Murodil") || teacher.equals("Saim")) {
            System.out.println("Java class with  " + teacher);
        } else if (teacher.equals("Nadir")) {
            System.out.println("Soft skill class with " + teacher);
        } else {
            System.out.println("Some class with " + teacher);
        }

        String company = "Google";
        double salary = 120_000;

        if (company.equals("Google ") || salary >= 120_000){
            System.out.println("Accept the offer from " +company);
        }else{
            System.out.println("Rejecting the offer from company " +company);
        }

    }

}