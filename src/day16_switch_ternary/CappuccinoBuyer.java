package day16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        System.out.println("Can I get  Cappuccino  please");
        double price = 0.00;
        double calories = 0;
        String size = "Grande";

        switch (size) {
            case "Tall":
                price = 3.69;
                calories = 90;
                System.out.println("Tall cappuccino please");
                break;
            case "Grande":
                price = 3.99;
                calories = 120;
                System.out.println("Grande cappuccino please");
                break;
            case "Venti":
                price = 4.29;
                calories = 150;
                System.out.println("Venti cappuccino please");
                break;
            default:
                System.out.println("We dont serve that  Cappuccino");
        }

        System.out.println("Total price: $" +price);
        System.out.println("You will consume " + calories + " calories of energy ");
    }
}
