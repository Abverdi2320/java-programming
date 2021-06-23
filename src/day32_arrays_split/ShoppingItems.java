package day32_arrays_split;

public class ShoppingItems {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("------- FIND THE INDEX OF 'GLOVES' IN ITEMS ARRAY-----");

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("Gloves found at index " + i);
                break;
            }
        }


        System.out.println("----- SET BOOLEAN TO TRUE IF FIRST 'IPAD' IS FOUND ");
        boolean iPadExists = false;
        for (String each : items) {
            if (each.equalsIgnoreCase("IPAD")) {
                iPadExists = true;
            }
        }
        System.out.println("ipadexist " + iPadExists);
        if (iPadExists) {
            System.out.println("we bought the ipad!!");
        } else {
            System.out.println("we forgot the ipad! :(");
        }


        System.out.println("----- Print a report of each shopping item -----");
        for (int k = 0; k < items.length; k++) {
            System.out.println(items[k] + " - $" + prices[k] + " # " + itemIDs[k]);

        }


        System.out.println("------Look for 'Jacket' in items and print all details -----");
        for (int m = 0; m < items.length; m++) {
            if (items[m].equalsIgnoreCase("jacket")) {
                System.out.println(items[m] + " - $" + prices[m] + " ## " + itemIDs[m]);
                break;
            }
        }


    }
}
