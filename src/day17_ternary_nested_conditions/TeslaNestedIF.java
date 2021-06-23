package day17_ternary_nested_conditions;

public class TeslaNestedIF {
    public static void main(String[] args) {
        char model = 'S';
        String trim = "Long range";

        if(model == 'S'){
            System.out.println("S Model selected");
            if(trim.equals(("Long range"))){
                System.out.println("Range 412");
                System.out.println("Top speed 155");
                System.out.println("0-60 = 3.1 Sec");
            }else if(trim.equals(("Plaid"))){
                System.out.println("Top speed 155MPH");
                System.out.println("range 412");
                System.out.println("0 - 60 = 3.1 sec ");
            }else {
                System.out.println("Top speed 155MPH");
                System.out.println("range 412");
                System.out.println("0 - 60 = 3.1 sec ");
            }
        }
    }
}
