package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car myCar = new Car();
//        myCar.make = "Bugatti Veyron";
//        myCar.year = 2013;
//        myCar.mileage = 750;

        myCar.setModel("Bugatti Veyron");
        System.out.println("My car model = " + myCar.getModel());
        myCar.setYear(2013);
        System.out.println("My car year = " + myCar.getYear());
        myCar.setMileage(780);
        System.out.println("My car mileage = " + myCar.getMileage());

        System.out.println(myCar.toString());
        System.out.println(myCar); //automatically calls toString method
        System.out.println();

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Alfa Romeo Giulia Ti AWD");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(16604);


        System.out.println("Model = " +alfaRomeo.getModel());
        System.out.println("Year = " +alfaRomeo.getYear());
        System.out.println("Mileage = " +alfaRomeo.getMileage());
        System.out.println(alfaRomeo);
    }
}
