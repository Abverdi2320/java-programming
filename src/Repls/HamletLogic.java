package Repls;

import java.util.*;

public class HamletLogic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(hamletQuote(in.nextBoolean(), in.nextBoolean()));

    }

    public static boolean hamletQuote(boolean toBe, boolean notToBe) {

       if (toBe == true && notToBe == false) {
            return true;
        }else{
            return false;

        }
    }
}
