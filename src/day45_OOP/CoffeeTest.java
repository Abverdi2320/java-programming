package day45_OOP;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        System.out.println("coffee amount = " +coffee.getAmount());
        coffee.refill();
        System.out.println("amount after refill = " +coffee.getAmount());
        coffee.drink(10);
        System.out.println("amount after drink 10 = " +coffee.getAmount());
        coffee.setType("Espresso");
        System.out.println("Coffee = " +coffee.getType());
        System.out.println(coffee.toString());


        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type = " +coffee1.getType());
        Coffee coffee2 = coffee1;
        System.out.println("coffee2 type = " + coffee2.getType());
        coffee2.setType("espresso");
        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappucino");
        System.out.println(coffee3.toString());

        coffee3=coffee2;
        System.out.println("coffee3 type = " + coffee3.getType());
        coffee3.setType("Latte");
        System.out.println(coffee3.toString());



    }
}
