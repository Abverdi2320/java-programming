package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10, 5);
        addNumbers(100, 200, 300);
        addNumbers(23, 45, 67, 3, 55, 767, 345, 756765, 2524, 454643, 778, 3412432, 24, 11);
        addNumbers();


        //int...myNumber = 10, 5; ERROR, var-args Only be used as a method parameter
    }

    public static void addNumbers(int... nums) {
        int sum = 0;

        for (int each : nums) {
            sum += each;
        }
        System.out.println("Sum = " + sum);
    }
}
