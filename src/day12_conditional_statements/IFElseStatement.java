package day12_conditional_statements;

public class IFElseStatement {
    public static void main(String[] args) {
        if(10> 5) {
            System.out.println("Condition is true");
        }else {
            System.out.println("Condition is False");
        }

        int count = 25;

        if(count > 30){
            System.out.println("count is greater than 30");
        }else{
            System.out.println("count is less than 30");
        }

        byte age = 14;
        if(age>=18){
            System.out.println("You are eligible to vote");
            System.out.println("Age is greater or equal to vote");
        }else {
            System.out.println("Not eligible to vote");
            System.out.println("Age is less than 18");
        }

        int money = 250;
        if(money>250){
            System.out.println("My $350 is more than your $250");
            System.out.println("$350 Is greater than $250");
        }else{
            System.out.println("My $250 is more than your $350");
            System.out.println("$250 is greater than $350");
        }

    }
}
