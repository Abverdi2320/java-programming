package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        String itemName = "Water";
        boolean onSale = true;
        boolean freeShipping = true;
        if (onSale && freeShipping) {
            System.out.println("Add " + itemName + " in card");
        } else {
            System.out.println("Go home code Java");
        }
        if(onSale && freeShipping &&itemName.equals("Water")){
            System.out.println("Add to cart " +itemName);
        }else{
            System.out.println("Continue shopping for good deals on - " + itemName);
        }

    }
}
