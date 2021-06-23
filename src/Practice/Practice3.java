package Practice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year and name of Pandemics: ");
        int pandemicYear = scan.nextInt();

        if (pandemicYear >= 1346 && pandemicYear <= 1353) {
            System.out.println("The Black Death was Pandemic was in " + pandemicYear);
        } else if (pandemicYear >= 1665 && pandemicYear <= 1666) {
            System.out.println("Great Plague Of London Pandemic was in " + pandemicYear);
        } else if (pandemicYear >= 1770 && pandemicYear <= 1772) {
            System.out.println("Russian Plague Pandemic was in " + pandemicYear);
        } else if (pandemicYear >= 1889 && pandemicYear <= 1890) {
            System.out.println("Flu Pandemic was in " + pandemicYear);
        } else if (pandemicYear == 1916) {
            System.out.println("American Polio Epidemic was in " + pandemicYear);
        } else if (pandemicYear >= 1918 && pandemicYear <= 1920) {
            System.out.println("Spanish Flu was in " + pandemicYear);
        } else if (pandemicYear >= 2009 && pandemicYear <= 2010) {
            System.out.println("H1N1 Swine Flu Pandemic was in " + pandemicYear);
        } else if (pandemicYear >= 2014 && pandemicYear <= 2014) {
            System.out.println("West African Ebola Epidemic was in " + pandemicYear);
        } else if (pandemicYear >= 2019 && pandemicYear <= 2021) {
            System.out.println("COVID-19 Pandemic is still around");
        } else if (pandemicYear < 0 && pandemicYear > 2021) {
            System.out.println("Invalid Year ");
        } else {
            System.out.println("No Pandemic");
        }
    }
}

