package day13_conditional_statements;

public class IFWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;

        if (isHungry == true) {
            System.err.println("I am hungry I will go get something to eat");
        } else {
            System.err.println("I am not hungry , Lets keep coding Java");
        }

        double price = 230.44;
        boolean isAffordable = price <= 200;
        System.out.println("isAffordable = " + isAffordable);
        if (isAffordable) {
            System.out.println("I can afford it , lets buy!");
        } else {
            System.out.println("Too expensive, lets keep coding Java");
        }

        boolean isRemoteJob = true;
        if(isRemoteJob){
            System.out.println("Sorry i am not interested");
        }else{
            System.out.println("Sure I am interested, what is the interview process");
        }
        String city = "Baku";


    }
}
