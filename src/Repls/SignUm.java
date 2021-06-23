package Repls;
import java.util.*;
public class SignUm {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the value:");
        int n = scan.nextInt();
        sign(n);

    }
    public static void sign(int n){
        if(n>0){
            System.out.println("positive");
        }else if(n<0){
            System.out.println("negative");
        }else{
            n=0;
            System.out.println("zero");
        }
    }
}
