package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "snack";
        String drinkItem = "coke";
        String SnackItem = "chips";

        if (selection.equals("drink")) {
            System.out.println("drink option is selected");
            if (drinkItem.equals("tea")) {
                System.out.println("tea item is selected");
            } else {
                System.out.println("coke item selected");
            }
        } else if (selection.equals("snack")) {
            System.out.println("snack option is selected");
            if (SnackItem.equals("chips")) {
                System.out.println("chips option selected");
                }else{
                System.out.println("candy option is selected");
            }
        }
    }
}

