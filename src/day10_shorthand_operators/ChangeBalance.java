package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);
        
        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        //decrease balance by baklava price
        balance = balance-baklava;
        System.out.println("balance after baklava  = " + balance);
        
        double kunefe = 44.45;
        System.out.println("kunefe = " + kunefe);

        balance=balance-kunefe;
        System.out.println("balance after kunefe = " + balance);
        
        //second kunefe is 50% off. lets buy it
        kunefe = kunefe/2;
        System.out.println("kunefe = $" + kunefe);
        //buy it and decrease balance with kunefe price
        balance=balance-kunefe;
        System.out.println("Balance after kunefe = $" + kunefe);


        double plov = 7.99;
        System.out.println("plov = $" +plov );
        balance = balance-plov;
        System.out.println("Balance after plov = $" + balance);
        
        double icedTea = 3;
        System.out.println("icedTead = $" + icedTea);
        //buy 4 icedTeas and decrease balance
        balance=balance-icedTea*4;
        System.out.println("Balance after icedTea = $" + balance);

        //return baklava
        System.out.println("Returning baklava = " + baklava);
        balance=balance+baklava;
        System.out.println("Balance after returning baklava = " + balance);

        
                
    }
}
