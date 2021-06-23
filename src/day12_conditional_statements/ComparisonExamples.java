package day12_conditional_statements;



public class ComparisonExamples {
    public static void main(String[] args){
        int currentSpeed = 45;
        int speedLimit = 55;
        boolean isSpeeding = currentSpeed>speedLimit;
        System.out.println("Are you speeding? = " +isSpeeding);
        System.out.println(speedLimit<currentSpeed);
        System.out.println(speedLimit==currentSpeed);

        System.out.println("Are you speeding? = " +isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + "Mph");
        System.out.println("speedLimit = " + speedLimit+ "Mph");

        currentSpeed  += 20;

        isSpeeding = currentSpeed >speedLimit;
        System.out.println("Are you speeding? = " +isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + "Mph");
        System.out.println("speedLimit = " + speedLimit+ "Mph");


        double accountBalance = 250.25;
        double itemPrice = 100;
        System.out.println("Can i afford it ? " +(accountBalance>itemPrice));
        System.out.println("accountBalance = $" + accountBalance);
        System.out.println("itemPrice = $" + itemPrice);

        boolean canAfford = accountBalance>itemPrice;
        System.out.println("canAfford = " + canAfford);

        accountBalance-=itemPrice;
        accountBalance = accountBalance-itemPrice;

        boolean isBroke = accountBalance <= 0 ;
        System.out.println("Are you broke ? " + isBroke);



    }
}
