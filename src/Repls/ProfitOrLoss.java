package Repls;
import java.util.*;
public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profits(in.nextInt(), in.nextInt()));
    }
    public static String profits(int buyPrice, int sellPrice){
        if(buyPrice<=sellPrice){
            return "profit";
        }else if(buyPrice>=sellPrice){
            return "loss";
        }else{
            return "no loss";
        }



    }
}
