package day15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        double budget = 5000;
        double carprice= 8999;
        String model = "Honda";

        if(carprice<=budget && model.equals("Honda") || model.equals("Toyota") || model.equals("Tesla")){
            System.out.println("Ready to purchase model = " + model + "\nPrice = " + carprice);
        }else{
            System.out.println("Not interested in model = " + model + "\nPrice = " + carprice);
        }
    }
}
