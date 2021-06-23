package day49_static;

public class StaticTest {
   static String word = "java";
    public static void main(String[] args) {
        //1) Static method can be called using class name
        StaticMethods.displayMessage("Wooden Spoon");

        //1) instance method needs an object to be called
        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();

        //2) static method can only access other static variables and methods
        System.out.println(word);



    }
}
