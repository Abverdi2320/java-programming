package OfficeHours.Practice_06_22_2021;

public class Amazon extends OnlineShopping {



    @Override
    public boolean payForShipping(double price) {
        return price>50;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item from amazon ");
    }
}
