package day07_arithmetic_operators_casting;

public class OperatorPrecedence {
    public static void main(String[] args){
        System.out.println(10 + 5);
        System.out.println(10 + 5 - 3);
        System.out.println(10 - 5 + 3);
        System.out.println(10 - (5 + 3));

        System.out.println(2 * 3);
        System.out.println(2 * 3 / 3);
        System.out.println(20 / (2 *2 ));

        System.out.println(0 / 10);

        System.out.println((2 + 5) * 3 );
        System.out.println(20 / (2*2));


        System.out.println(10 /3 );
        System.out.println(5 / 2);

        byte num1 = 10;
        byte num2 = 2;
        System.out.println(num1 / num2);

        System.out.println(10.0 /3.0);
    }
}