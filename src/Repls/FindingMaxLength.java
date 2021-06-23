package Repls;

import java.util.*;

public class FindingMaxLength {
    public static void main(String[] args) {
        String str [][] = {{"Mike Artur","Mike123"},{"Jason Mike","Coole1233"},{"Johnny avard","Avard123"},{"Ford","Fiesta"}};
        System.out.println(str[0][0]);
        System.out.println(str[0][1]);
        System.out.println(str[1][0]);
        System.out.println(str[1][1]);
        System.out.println(str[2][0]);
        System.out.println(str[2][1]);
        System.out.println(str[3][0]);
        System.out.println(str[3][1]);


        System.out.println();


        for(int i = 0; i< str.length; i++){
            for(int j =0; j<str[i].length; j++){
                if(str[i][j].length()>5){
                    System.out.println(str[i][j]);
                }
            }
        }


    }
}
