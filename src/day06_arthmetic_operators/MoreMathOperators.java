package day06_arthmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args){
        int Toyotas = 431;
        int Hondas = 233;
        int VW = 2;
        int Tesla = 20;
        int Nissan = 1;
        int Bmw = 155;
        int totalCarsInParking = Toyotas + Hondas + VW + Tesla + Nissan + Bmw;
        System.out.println("There are " + totalCarsInParking + " cars in parking lot");

        String pizza = "hawaiian";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices / people ;

        //we ordered hawaiian pizza with 8 slices, 4 people ate 2 slices each
        System.out.println(" we ordered hawaiian pizza with " + slices +  " slices, " + people  + " people ate " + slicesPerPerson + " slices per person." );

        String cars = "Lamborghini";
        int sellers = 6;
        int customers = 3;
        int carsPerPerson = sellers / customers;
        System.out.println(" There are " + sellers + " sellers and " + customers + " customers, but there is only " + carsPerPerson + " cars per person");




    }
}
