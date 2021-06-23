package day48_constructors_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {
        //add is static method, can be called using Classname.staticMethodName
        //static way of calling the method
        Calculator.add(5,3);

        //Calculator.multiply(2,4); ERROR: multiply is not static. need object to call it
        //Multiply is instance method, and we are creating object then calling it
        Calculator calculator = new Calculator();
        calculator.multiply(6,3);

        calculator.add(10,45);
    }
}
