package OfficeHours.Practice_03_02_2021;

public class Apartment {
    public static void main(String[] args) {
        String company = "******** Kempinski Apartments Complex ********  ";
        String adress = "512 Lincoln boulevard Brooklyn  NewYork  ";
        String nameOfOwner = "Abbas Verdi";
        byte numberOfUnits = 19;
        int averageSizeOfEachUnit = 882;
        short monthlyRent = 1800;
        byte numberOfWashers = 125;
        boolean allowsPets = true;
        boolean hasPool = true;
        String lengthOfLease = "36 month";
        short totalNumberOfResidents = 2400;
        String phoneNumberOfOwner = "(212)-202-2222";
        boolean isNearGasStation = true;
        byte numberOfFloors = 22;
        boolean hasABasement = true;
        boolean hasAvailableUnitsForRent = true;
        boolean hasAirConditionin = true;
        byte numberOfReviewStars = 5;
        double monthlyRentAfter3Years = monthlyRent - (monthlyRent * 0.10);
        double monthlyRentAfter6Years = monthlyRent - (monthlyRent * 0.20);






        System.err.println(company );
        System.out.println("Welcome to Kempinski Apartments Complex. " + "We are located at "
                +adress+"." + "\nFounder & President of Company is " + nameOfOwner+"." +
                " There are " +numberOfUnits+ " units at our Complex."
                + " \nAnd monthly rent will cost to our dear residents " +"$"
                + monthlyRent +"." + "\nTotal number of washer in Complex is "
                + numberOfWashers+"." +
                " Pets does not allowed to apartments ----> "
                + allowsPets+"." + "\nSwimming pool is in service for" +
                " our residents seasonly only-----> "+"."  +hasPool +
                "\nMinimum lenght of lease must be "
                + lengthOfLease+"." + " Capacity of total residence is "
                +totalNumberOfResidents +
                " in our Complex." + "\nYou can reach out to President of Complex from "
                +phoneNumberOfOwner+"." + "\nThere is also Gas Station located nearby ----> " +
                "" +isNearGasStation+"." +
                "\nNumber of floors in this Complex is "
                + numberOfFloors+"." + "\nComplex also has basement ---> " + hasABasement + "." +
                "\nAnd air conditioning ----> " + hasAirConditionin+"." + "\nStill we have available units for new tenants" +
                " who wants to rent apartment ---> "
                + hasAvailableUnitsForRent+"." + "\nOur apartment Complex graded as "
                + numberOfReviewStars + "." + "\nMonthly rent after 3 years wil be " + "$"
                + monthlyRentAfter3Years + "\nMontly rent after 6 years will be " + "$"+ monthlyRentAfter6Years );



    }
}
