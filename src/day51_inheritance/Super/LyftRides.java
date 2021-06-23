package day51_inheritance.Super;

public class LyftRides {
    public static void main(String[] args) {
        Lyft lyftRides = new Lyft();
        LyftXL lyftXLRides = new LyftXL();
        LyftLux luxRide = new LyftLux();

        System.out.println("luxRide for 5 miles = $" + luxRide.calculateRate(5));
        System.out.println("lyftXLRides for 5 miles = $" + lyftXLRides.calculateRate(5));
        System.out.println("luxRide for 5 miles = $" + luxRide.calculateRate(5));
    }
}
