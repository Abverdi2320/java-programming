package Repls;

public class leastExpensive {
    public static void main(String[] args) {
        String[] items = {"Shoes",   "Jacket",  "Gloves",  "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99,    150.0,       9.99,      250.0,   439.50,     39.99};
        int[] itemIDS = {12345,    12346,        12347,      12348,   12349,      12350};


        double leastExpensive = prices[0];
        int indexOfLeast = 0;

        for(int i = 0; i< prices.length; i++){
            if(prices[i]<leastExpensive){
                leastExpensive=prices[i];
                indexOfLeast=i;
            }
        }
        System.out.println("leastExpensive = " + leastExpensive);
        System.out.println("indexOfLeast = " + indexOfLeast);
        System.out.println("itemIDS = " + itemIDS[indexOfLeast]);
        System.out.println(items[indexOfLeast]+ " - $"+ prices[indexOfLeast] + " #" +itemIDS[indexOfLeast]);
    }
}
