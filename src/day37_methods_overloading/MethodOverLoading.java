package day37_methods_overloading;

public class MethodOverLoading {
    public static void main(String[] args) {
        System.out.println(sum(5,10));
        System.out.println(sum(2.5,5.1));
        System.out.println(sum(3,5,8));
        System.out.println(sum("Hello","World"));


    }
    public static int sum(int num1,int num2){
        return num1+num2;
    }
    public static double sum(double num1, double num2){
        return num1+num2;
    }
    public static int sum(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public static String sum (String word1, String word2){
        return word1+word2;
    }
}
