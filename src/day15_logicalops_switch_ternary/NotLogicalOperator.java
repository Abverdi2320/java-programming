package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 2;

        if (!(age > 7)) {
            System.out.println("Need to sit in child car seat " + age);
        } else {
            System.out.println("No need to sit in child car seat buddy " + age);
        }

        boolean isSmokingAllowed = false;

        if (!isSmokingAllowed){
            System.out.println("Smoking is not allowed here. Exit");
        }



        boolean isAffordable = false;

        if (!isAffordable){
            System.out.println("Item not affordable");
        }


        String env = "qa";
        if (!env.equals("qa")){
            System.out.println("In wrong environment for QA testing ");
        }

        String carModel = "Tesla";
        if(!carModel.equals("tesla")){
            System.out.println("if its not tesla im not interested");
        }

        String secretPassword = "abc123";
        String inputPassword = " abc321";

        if(!inputPassword.equals("abc123")){
            System.out.println("Incorrect Password");
        }
    }
}
