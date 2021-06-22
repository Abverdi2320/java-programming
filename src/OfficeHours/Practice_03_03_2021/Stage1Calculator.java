package OfficeHours.Practice_03_03_2021;

public class Stage1Calculator {
    public static void main(String[] args) {

        double d1 = 5.0;
        double d2 = 10.0;

        double addition = d1 + d2;
        double subtraction = d1 - d2;
        double multiplication = d1 * d2;
        double division = d1 / d2;
        double remainder = d1 % d2 ;

        System.out.println("Calculations for " + d1 + " & " +d2 );
        System.out.println(d1 + " + " + d2 + " = " +addition );
        System.out.println(d1 + " - " + d2 + " = " +subtraction );
        System.out.println(d1 + " * " + d2 + " = " +multiplication  );
        System.out.println(d1 + " / " + d2 + " = " +division );
        System.out.println(d1 + " % " + d2 + " = " +remainder );

        System.out.println();
        //Print without variables
        System.out.println("Calculations for " + d1 + " & " +d2 );
        System.out.println(d1 + " + " + d2 + " = " + (d1 + d2) );
        System.out.println(d1 + " - " + d2 + " = " + (d1 - d2));
        System.out.println(d1 + " * " + d2 + " = " + ( d1 * d2));
        System.out.println(d1 + " / " + d2 + " = " + ( d1 / d2) );
        System.out.println(d1 + " % " + d2 + " = " + (d1 % d2) );






    }
}
