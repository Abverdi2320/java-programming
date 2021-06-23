package day16_switch_ternary;

public class ApartmentLease {
    public static void main(String[] args) {
        int numberOfBedrooms = 1;
        int startingPrice = 0;

        switch (numberOfBedrooms) {
            case 0:
                startingPrice = 1400;
                System.out.println("Studio apartment selected $" + startingPrice);
                break;
            case 1:
                startingPrice = 1725;
                System.out.println("One bedroom apartment selected $" + startingPrice);
                break;
            case 2:
                startingPrice = 2899;
                System.out.println("Two bedroom apartment selected ");

            default:
                System.out.println("Starting price $" + startingPrice);
        }
        ;

    }
}
