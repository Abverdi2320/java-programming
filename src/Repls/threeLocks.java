package Repls;

import java.util.*;

public class threeLocks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(threeLocks(in.nextBoolean(), in.nextBoolean(),in.nextBoolean()));

    }
    public static boolean threeLocks(boolean a,boolean b, boolean c){
        if(a&&b){
            return true;
        }
        if(c){
            return true;
        }else{

        }
        return false;

    }
}
