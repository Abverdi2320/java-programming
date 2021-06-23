package day35_methods_with_param;


public class MethodsWithParams {
    public static void main(String[] args) {
        displayValue(25);
        displayValue(22);
        int count = 55;
        displayValue(count);
        greetByName("Abbas");
        greetByName("Maarif");
        String name = "Qorxmaz";
        greetByName(name);
    }

    public static void displayValue(int num) {
        System.out.println("num = " + num);

    }

    public static void greetByName(String name) {
        System.out.println("Hello " + name + " how are you ?");



    }
}
