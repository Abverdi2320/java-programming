package day58_polymorphism;

public abstract class OnlineShopping {
    public abstract void buy();
    public abstract void sell();
    public void shipping(){
        System.out.println("Shipping the purchased items");
    }
}
