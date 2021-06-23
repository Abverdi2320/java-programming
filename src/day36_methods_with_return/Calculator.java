package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("10.3+10.3 = " + add(10.3, 10.3));
        System.out.println("350-200 = " +minus(350, 200));
        System.out.println("3*5 = " +multiply(3,5));
        System.out.println("60/12 = " +divide(60,12));

    }

    public static double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public static double minus(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public static double multiply(double num1, double num2) {
        double sum = num1 * num2;
        return sum;
    }

    public static double divide(double num1, double num2){
        double sum = num1/num2;
        return sum;
    }
}
